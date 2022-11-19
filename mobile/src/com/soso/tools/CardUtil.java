package com.soso.tools;

import com.soso.common.Common;
import com.soso.entity.*;
import com.soso.service.ICallService;
import com.soso.service.INetService;
import com.soso.service.ISendService;
import com.soso.service.impl.NetPackageImpl;
import com.soso.service.impl.SuperPackageImpl;
import com.soso.service.impl.TalkPackageImpl;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * @author: RainGrd
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class CardUtil {
    /*用户列表*/
    static Map<String, MobileCard> cardMap = new HashMap<>();
    /*电话卡的消费记录*/
    static Map<String, List<ConSumInfo>> csInfo = new HashMap<>();
    static MobileCard card = null;
    /*创建一个用户使用场景类的集合*/
    static List<Scene> scenes = new ArrayList<>();
    /*输入/输出*/
    static Scanner input = new Scanner(System.in);

    /**
     * @param
     * @return 方法描述：生成随机卡号
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:11:15 2022/4/13
     **/
    public static String createNumber() {
        /*创建随机数*/
        Random random = new Random();
        int i = 0;
        String number = "";
        /*电话号码前三位数*/
        String[] numbers = {"150", "158", "139", "135"};
        int j = 0;
        /*判断卡号是否大于7位*/
        while (i <= 10000000) {
            /*随机数目*/
            j = random.nextInt(numbers.length);
            i = random.nextInt(100000000);
            number = numbers[j] + i;
            /*判断卡号是否存在*/
            if (isExistCard(number) && number.length() < 10000000) {
                /*跳过*/
                continue;
            }
        }
        return number;
    }

    /**
     * @return 方法描述：话费充值
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:12:47 2022/4/13
     **/
    public static void changeMoney() {
        /*使用话费*/
        System.out.println("请输入充值卡号");
        String phone = input.next();
        if(!isExistCard(phone)){
            System.out.println("没有此手机号码 请重新输入：");
            phone = input.next();
        }
        System.out.println("卡号"+phone+",请输入充值金额(充值额度最低为50元):");
        double money = input.nextDouble();
        /*判断充值金额是否满足充值条件*/
        if (money <= 50 || money>500) {
            System.out.println("充值金额必须大于或等于50元并且不能大于500元");
            money = input.nextDouble();
        }
        /*修改话费金额*/
        cardMap.get(phone).setMoney(cardMap.get(phone).getMoney() + money);
        System.out.println("充值成功！当前话费余额为" + cardMap.get(phone).getMoney() + "元。");
    }

    /**
     * @param number 卡号
     * @return 方法描述：使用嗖嗖
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:17:21 2022/4/13
     **/
    public static void useSoSo(String number) {
        /*获取该卡对象*/
        card = cardMap.get(number);
        /*获取所属套餐*/
        BaseServicePackage pack = card.getServer();
        /*创建三个服务类对象*/
        ICallService callService = null;
        INetService netService = null;
        ISendService sendService = null;
        /*生成随机数*/
        Random random = new Random();
        int randomNum = 0;
        /*临时变量*/
        int temp = 0;
        /*用于控制循环*/
        int index = 0;
        do {
            randomNum = random.nextInt(6);
            /*获取使用场景类*/
            Scene scene = scenes.get(randomNum);
            switch (randomNum) {
                case 0:
                case 1:
                    if (pack instanceof ICallService) {
                        callService = (ICallService) pack;
                        /*执行通话方法*/
                        try {
                            /*展示描述*/
                            System.out.println(scene.getDescription());
                            temp = callService.call(scene.getData(), card);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        /*添加消费记录*/
                        addConSumInfo(number, new ConSumInfo(number, scene.getType(), temp));
                        index = 1;
                    } else {
                        /*如果此套餐不支持就逃过，继续随机*/
                        index = 1;
                    }
                    break;
                case 2:
                case 3:
                    if (pack instanceof ISendService) {
                        sendService = (ISendService) pack;
                        /*执行计算流量方法*/
                        try {
                            /*展示方法*/
                            System.out.println(scene.getDescription());
                            temp = sendService.send(scene.getData(), card);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        /*添加消费记录*/
                        addConSumInfo(number, new ConSumInfo(number, scene.getType(), temp));
                        index = 1;
                    } else {
                        index = 1;
                    }
                    break;
                case 4:
                case 5:
                    if (pack instanceof INetService) {
                        netService = (INetService) pack;
                        /*执行计算流量方法*/
                        try {
                            /*展示方法*/
                            System.out.println(scene.getDescription());
                            temp = netService.netPlay(scene.getData(), card);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        /*添加消费记录*/
                        addConSumInfo(number, new ConSumInfo(number, scene.getType(), temp));
                        index = 1;
                    } else {
                        index = 1;
                    }
                    break;
                default:
                    break;
            }
        } while (index == 0);
    }

    /**
     * @param
     * @return 方法描述：资费说明
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:18:14 2022/4/13
     **/
    public static void showDescription() {
        /*使用IO将套餐说明文件的内容输出到控制台中*/
        BufferedReader reader = null;
        File file = null;
        StringBuffer sb = new StringBuffer();
        try {
            file=new File("D:\\学习资料\\idea\\mobile\\src\\com\\soso\\套餐资费说明.txt");
            reader = new BufferedReader(new FileReader(file));
            char[] chars = new char[1024];
            int len = 0;
            /*利用循环写入文件，并且用的是字符流，不是字节流*/
            while ((len = reader.read(chars)) != -1) {
                sb.append(new String(chars, 0, len));
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param number 卡号
     * @return 方法描述：本月账单查询
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:23:45 2022/4/13
     * 合计（是套餐固定资费和超出套餐使用费用总和）
     * 超出套餐的计费
     * 通话：0.2元/分钟
     * 短信：0.1元/分钟
     * 上网流量：0.1元/MB（1GB=1024MB）
     **/
    public static void showAmountDetail(String number) {
        StringBuffer sb = new StringBuffer();
        /*获得指定卡号的对象*/
        card = cardMap.get(number);
        sb.append("您的卡号:" + number + ",当月账单: \n");
        sb.append("套餐资费：" + card.getServer().getPrice() + "元\n");
        /*本月消费总额：是套餐固定资费和超出套餐使用费用总和 */
        sb.append("合计：" + Common.dateFormat(card.getConSumAmount()) + "元\n");
        sb.append("账户余额：" + Common.dateFormat(card.getMoney()) + "元");
        System.out.println(sb);
    }

    /**
     * @param
     * @return 方法描述：初始化用户
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 21:54:40 2022/4/15
     **/

    public static void initUser() {
        /*初始化用户*/
        cardMap.put("13965756432",
                new MobileCard("user", "13965756432", "123", new SuperPackageImpl(), 80, 30, 50, 1, 42.0));
        cardMap.put("13911568956",
                new MobileCard("yui", "13911568956", "156", new TalkPackageImpl(), 80, 30, 50, 90.5));
        cardMap.put("13924221868",
                new MobileCard("drg", "13924221868", "123", new NetPackageImpl(), 80, 2, 80.2));
    }

    /**
     * @param number 卡号
     * @return 方法描述：套餐余量查询
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:25:24 2022/4/13
     * 合计（是套餐固定资费和超出套餐使用费用总和）
     * 超出套餐的计费
     * 通话：0.2元/分钟
     * 短信：0.1元/分钟
     * 上网流量：0.1元/MB（1GB=1024MB）
     **/
    public static void showRemainDetail(String number) {
        StringBuffer sb = new StringBuffer();
        card = cardMap.get(number);
        sb.append("您的卡号是" + number + "，套餐内剩余:\n");
        /*用于计算的通话时间、短信条数、流量*/
        int time = 0;
        int flow = 0;
        int count = 0;
        if (card.getServer() instanceof SuperPackageImpl) {
            /*向下转型*/
            SuperPackageImpl sp = (SuperPackageImpl) card.getServer();
            /*计算通话时长*/
            time = card.getRealTalkTime() < sp.getTalkTime() ? sp.getTalkTime() - card.getRealTalkTime() : 0;
            sb.append("通话时长：" + time + "分钟\n");
            /*计算短信条数*/
            count = card.getRealSmsCount() < sp.getSmsCount() ? sp.getSmsCount() - card.getRealSmsCount() : 0;
            sb.append("短信条数" + count + "条\n");
            /*计算流量*/
            flow = card.getRealFlow() < sp.getFlow() ? sp.getFlow() - card.getRealFlow() : 0;
            sb.append("上网流量为" + Common.dateFormat(flow * 1.0 / 1024) + "GB\n");
        } else if (card.getServer() instanceof NetPackageImpl) {
            /*向下转型*/
            NetPackageImpl sp = (NetPackageImpl) card.getServer();
            /*计算流量*/
            flow = card.getRealFlow() < sp.getFlow() ? sp.getFlow() - card.getRealFlow() : 0;
            sb.append("上网流量为" + Common.dateFormat(flow * 1.0 / 1024) + "GB\n");
        } else if (card.getServer() instanceof TalkPackageImpl) {
            /*向下转型*/
            TalkPackageImpl sp = (TalkPackageImpl) card.getServer();
            /*计算通话时长*/
            time = card.getRealTalkTime() < sp.getTalkTime() ? sp.getTalkTime() - card.getRealTalkTime() : 0;
            sb.append("通话时长：" + time + "分钟\n");
            /*计算短信条数*/
            count = card.getRealSmsCount() < sp.getSmsCount() ? sp.getSmsCount() - card.getRealSmsCount() : 0;
            sb.append("短信条数" + count + "条\n");
        }
        System.out.print(sb);
    }
    /**
     * @param number 卡号
     * @return 方法描述：打印指定卡号消费清单
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:28:16 2022/4/13
     **/
    public static void printConSumInfo(String number) {
        /*字符拼接*/
        StringBuffer sb = new StringBuffer();
        /*获得卡号*/
        Set<String> set = csInfo.keySet();
        List<ConSumInfo> list = null;
        Iterator<String> iterator = set.iterator();
        /*创建写入文件对象*/
        BufferedWriter bw = null;
        try {
            /*判断这个卡是否存在于消费记录里*/
            while (iterator.hasNext()) {
                if (iterator.next().equals(number)) {
                    bw = new BufferedWriter(new FileWriter("D:\\学习资料\\idea\\mobile\\src\\record\\"+number + "-"+cardMap.get(number).getUserName()+"的消费记录.txt"));
                    /*获取消费记录*/
                    list = csInfo.get(number);
                    /*输出指定卡号的消费记录*/
                    sb.append("*******" + number + "消费记录*******\n");
                    sb.append("序号\t\t类型\t\t数据\t(通话(条 /上网(MB) /短信（条）)");
                    /*获得指定卡号的消费记录*/
                    for (int i = 0; i < list.size(); i++) {
                        /*打印这张卡的消费记录*/
                        sb.append("\n" + (i + 1) + ".\t\t" + list.get(i).getType() + "\t\t" + list.get(i).getConSumData());
                    }
                    /*写入*/
                    bw.write(sb.toString());
                    /*冲洗*/
                    bw.flush();
                    /*关闭流*/
                    bw.close();
                    break;
                } else {
                    sb.append("对不起！不存在这张卡的消费记录，不能打印！");
                    break;
                }
            }
            /*用于判断数据是否含有消费记录*/
            if (set.size() == 0) {
                sb.append("对不起！不存在这张卡的消费记录，不能打印！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*输出*/
        System.out.println(sb);
    }

    /**
     * @param number,packNum 卡号,套餐
     * @return 方法描述：套餐变更
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:29:43 2022/4/13
     **/
    public static void changingPack(String number, String packNum) {
        /*更换套餐的对象*/
        BaseServicePackage pack = null;
        /*指定卡号对象*/
        card = cardMap.get(number);
        switch (packNum) {
            case "1":
                pack = new TalkPackageImpl();
                break;
            case "2":
                pack = new NetPackageImpl();
                break;
            case "3":
                pack = new SuperPackageImpl();
                break;
            default:
                System.out.println("没有此套餐！请重新输入：");
                number=input.next();
                break;
        }
        /*根据包名老判断新套餐和旧套餐的是否一致*/
        if (!(card.getServer().getClass().getName().equals(pack.getClass().getName()))) {
            /*计算账户余额：消费的总金额减去套餐资费判断是否该套餐的资费*/
            if (card.getMoney() >= pack.getPrice()) {
                /*消费记录全部清零*/
                card.setRealFlow(0);
                card.setRealTalkTime(0);
                card.setRealSmsCount(0);
                /*更换套餐*/
                card.setServer(pack);
                /*设置账户余额*/
                card.setMoney(card.getMoney() - pack.getPrice());
                /*消费记录*/
                card.setConSumAmount(pack.getPrice());
                /*显示套餐信息*/
                System.out.print("更换成功！您更换的套餐为");
                pack.showInfo();
            } else {
                System.out.println("对不起！你的余额不足以支付新套餐本月资费，请问是否充值：1.充值，2.不充值");
                int index = input.nextInt();
                while (index == 1) {
                    changeMoney();
                    index = 2;
                }
            }
        } else {
            System.out.println("对不起！您已经是该套餐用户了，无需更换套餐！");
        }
    }

    /**
     * @param count 用于指定返回几个卡号
     * @return 方法描述：获取新的卡号集合
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:35:28 2022/4/13
     **/
    public static String[] getNewNumbers(int count) {
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            /*填充卡号*/
            str[i] = createNumber();
        }
        return str;
    }

    /**
     * @param cards 注册电话卡
     * @return 方法描述：添加新卡
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:38:09 2022/4/13
     **/
    public static void addCard(MobileCard cards) {
        /*判断账号是否存在*/
        cardMap.put(cards.getCardNumber(), cards);
    }

    /**
     * @param number 卡号
     * @return 方法描述：办理退网
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:39:15 2022/4/13
     **/
    public static void delCard(String number) {
        Set<String> set = cardMap.keySet();
        for (int i = 0; i < set.size(); i++) {
            /*判断是否含有这个主键*/
            if (cardMap.containsKey(number)) {
                /*判断这个账户是否欠费*/
                /*欠费的标准：套餐余量有一样低于零，并且账户余额为零*/
                System.out.println("卡号" + number + "办理退网成功");
                /*清除这个账号*/
                cardMap.remove(i);
                System.out.println("谢谢使用");
                /*退出系统*/
                break;
            }
        }
    }
    /**
     * @param
     * @return 方法描述：初始使用场景
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:40:10 2022/4/13
     **/
    public static void initScene() {
        scenes.add(new Scene("通话", 90, "问候客户，谁知其如此难缠 通话90分钟"));
        scenes.add(new Scene("通话", 30, "询问妈妈身体状况，本地通话30分钟"));
        scenes.add(new Scene("短信", 5, "参与环境保护实施方案问卷调查，发送短信5条"));
        scenes.add(new Scene("短信", 50, "通知朋友手机换号，发送短信50条"));
        scenes.add(new Scene("上网", 1 * 1024, "和女友微信视频聊天，使用流量1GB"));
        scenes.add(new Scene("上网", 2 * 1024, "晚上手机在线看韩剧，不留神睡着啦！使用流量2GB"));
    }

    /**
     * @param number 卡号
     * @return 方法描述：验证该卡是否注册
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:33:55 2022/4/13
     **/
    public static boolean isExistCard(String number) {
        boolean judge = false;
        /*非空和主键判断*/
        if(number!=null && cardMap.containsKey(number)){
            judge = true;
        }
        return judge;
    }

    /**
     * @param number,passWord 卡号,密码
     * @return 方法描述：验证该卡是否注册
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 18:40:58 2022/4/13
     **/
    public static boolean isExistCard(String number, String passWord) {
        if (isExistCard(number) && cardMap.get(number).getPassWord().equals(passWord))
            return true;
        return false;
    }

    /**
     * @param
     * @return 方法描述：根据用户选择的套餐序号返回套餐类型
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 16:19:02 2022/4/14
     **/
    public static BaseServicePackage createPack(int packId) {
        BaseServicePackage servicePackage = null;
        /*判断套餐*/
        switch (packId) {
            case 1:
                servicePackage = new TalkPackageImpl();
                break;
            case 2:
                servicePackage = new NetPackageImpl();
                break;
            case 3:
                servicePackage = new SuperPackageImpl();
                break;
            default:
                /*如果没有返回null*/
                return null;
        }
        return servicePackage;
    }

    /**
     * @param
     * @return 方法描述：添加指定卡号的消费记录
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 16:21:45 2022/4/14
     **/
    public static void addConSumInfo(String number, ConSumInfo info) {
        List<ConSumInfo> infos = new ArrayList<>();
        Set<String> numbers = csInfo.keySet();
        Iterator<String> iterator = numbers.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            /*判断是不是此卡号*/
            if (iterator.next().equals(number)) {
                infos = csInfo.get(number);
                /*添加一条数据*/
                infos.add(info);
                flag = true;
                System.out.println("已添加一条数据");
                break;
            }
        }
        /*如果不是此卡号，就重新在添加一天新卡号的消费数据*/
        if (!flag) {
            infos.add(info);
            /*添加此卡的消费数据*/
            csInfo.put(number, infos);
            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
        }
    }
    /**
     * 方法描述：拓展，打开套餐资费说明书
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 16:00:48 2022/4/20
     * @param 
     * @return 
     **/
    public static void openFile(File file){
        /*判断当前文件是否存在此电脑*/
        if (!Desktop.isDesktopSupported()) {
            System.out.println("没有此文件存在！");
            return;
        }
        /*返回当前DeskTop实例*/
        Desktop desktop = Desktop.getDesktop();
        try {
            /*打开文件*/
            desktop.open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
