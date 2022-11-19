package src.com.bdqn.demo1;

import java.io.*;
import java.net.*;

/**
 * @author: duan.rong.gui
 * @date: 2022/3/31 11:21:21
 * @description: 主方法
 * @version: 1.0
 * 类描述：
 */
public class DemoTest {
    @org.junit.Test
    public void test1(){
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            InetAddress localPort = InetAddress.getByName("www.nciae.edu.cn");
            System.out.println(localHost);
            System.out.println(localPort);
            System.out.println("本机的IP地址"+localHost.getHostAddress());
            System.out.println("远程的IP地址"+localPort.getHostAddress());
            System.out.println("本机的主机名"+localHost.getHostName());
            System.out.println("远程的主机名"+localPort.getHostName());
            System.out.println(localHost.isReachable(5000));
            System.out.println(localPort.isReachable(5000));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 19:43:30 2022/4/12
     * @param 
     * @return 
     * 方法描述：upd发送数据
     **/
    @org.junit.Test
    public void test2(){
        /*创建发送端DatagramSocket对象*/
        try {
            DatagramSocket ds = new DatagramSocket();
            /*需要传输的数据*/
            byte[] bytes="Hello,upd,我来了".getBytes();
            /*数据长度*/
            int len=bytes.length;
            /*本机的IP地址*/
            InetAddress address = InetAddress.getByName("192.168.0.60");
            /*端口号*/
            int port=10086;
            DatagramPacket dp = new DatagramPacket(bytes,len,address,port);
            /*创建数据，并把数据打包*/
            /*调用方法发送数据*/
            ds.send(dp);
            /*测试方法*/
            System.out.println(ds.getPort());
            System.out.println(ds.getBroadcast());
            System.out.println(ds.getChannel());
            System.out.println(ds.getLocalAddress());
            System.out.println(ds.getLocalPort());
            System.out.println(ds.getReuseAddress());
            System.out.println(ds.getInetAddress());
            System.out.println(ds.getSendBufferSize());
            System.out.println(ds.getClass());
            System.out.println(ds.getTrafficClass());
            System.out.println(ds.isClosed());
            /*关闭发送端*/
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 19:43:56 2022/4/12
     * @param 
     * @return 
     * 方法描述：upd接收数据
     **/
    @org.junit.Test
    public void test3(){
        try {
            DatagramSocket socket = new DatagramSocket(10086);
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            /*调用方法接收数据*/
            socket.receive(dp);
            byte[] data = dp.getData();
            int length=dp.getLength();
            System.out.println(dp.getOffset());
            System.out.println(dp.getAddress());
            System.out.println(dp.getClass());
            /*返回发送数据报的远程主机上的端口号，或从中接收数据报的端口号。 */
            System.out.println(dp.getPort());
            String s = new String(data,0,length);
            System.out.println(s);
            /*关闭接收端*/
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void test4(){
        try {
            /*创建客户端的socket对象*/
//            Socket socket = new Socket(InetAddress.getByName("192.168.0.60"),10000);
            Socket socket = new Socket("192.168.0.60", 10000);
            /*创建输出流*/
            OutputStream output = socket.getOutputStream();
            output.write("hello tcp 我来了".getBytes());
            /*释放资源*/
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void test5() {
        /*创建服务器端的对象*/
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            /*创建输入流对象*/
            InputStream inputStream = serverSocket.accept().getInputStream();
            byte[] bytes = new byte[1024];
            String data=new String(bytes,0, inputStream.read(bytes));
            System.out.println("数据是："+data);
            /*释放资源*/
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*-------------------------------------*/
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 8:17:00 2022/4/13
     * @param 
     * @return 
     * 方法描述：客户端
     **/
    @org.junit.Test
    public void test6(){
        try {
            Socket socket = new Socket("192.168.0.60",10000);
            socket.getOutputStream().write("hello tcp 我来了".getBytes());
            /*接收服务器反馈*/
            byte[] bytes = new byte[1024];
            int read = socket.getInputStream().read(bytes);
            System.out.println("客户端："+new String(bytes,0,read));
            /*释放资源*/
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 8:22:12 2022/4/13
     * @param 
     * @return 
     * 方法描述：服务器
     **/
    @org.junit.Test
    public void test7() {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            /*生成字节流输入对象，读取数据*/
            byte[] bytes = new byte[1024];
            Socket accept = serverSocket.accept();
            int read = accept.getInputStream().read(bytes);
            System.out.println("服务器："+new String(bytes,0,read));
            /*给出反馈*/
            accept.getOutputStream().write("数据已经收到".getBytes());
            /*释放资源*/
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*---------------------------------*/
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:09:54 2022/4/13
     * @param 
     * @return 
     * 方法描述：客户端的数据来自于文本文件
     **/
    @org.junit.Test
    public void test8() {
        String path="D:\\学习资料\\idea\\day07\\Test.java";
        /*创建文本文件*/
        File file = new File(path);
        try {
            file.createNewFile();
            Socket socket = new Socket("192.168.0.60", 10000);
            /*读取文本文件的数据*/
            BufferedReader reader = new BufferedReader(new FileReader(path));
            /*写入输出流对象*/
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
            /*释放资源*/
            reader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:10:16 2022/4/13
     * @param 
     * @return 
     * 方法描述：将服务器的数据写入文本文件
     **/
    @org.junit.Test
    public void test9(){
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            /*监听客户端的连接*/
            /*InputStream inputStream = serverSocket.accept().getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);*/
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            String line;
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\学习资料\\idea\\day07\\test.txt"));
            StringBuffer buffer= new StringBuffer();
            while (((line=br.readLine())!=null)) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            /**/
            bw.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*-------------------------*/
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:22:57 2022/4/13
     * @param 
     * @return 
     * 方法描述：客户端的访问程序
     **/
    @org.junit.Test
    public void test10(){
        try {
            Socket socket = new Socket("192.168.0.60", 8086);
            /*读取文本文件的数据*/
            BufferedReader reader = new BufferedReader(new FileReader("D:\\学习资料\\idea\\day07\\Test.java"));
            /*写入输出流对象*/
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
            /*自定结束标记*/
            /*writer.write("886");
            writer.newLine();
            writer.flush();*/
            socket.shutdownOutput();
            /*接收反馈*/
            BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bfr.readLine();
            System.out.println("服务器的反馈："+s);
            /*释放资源*/
            reader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 9:23:24 2022/4/13
     * @param 
     * @return 
     * 方法描述：服务器端的访问数据
     **/
    @org.junit.Test
    public void test11() {
        try {
            ServerSocket serverSocket = new ServerSocket(8086);
            /*监听客户端的连接*/
            /*InputStream inputStream = serverSocket.accept().getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);*/
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.accept().getInputStream()));
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\学习资料\\idea\\day07\\Copy.java"));
            String line;
            while (((line=br.readLine())!=null)) {
                /*if("886".equals(line)){
                    break;
                }*/
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            System.out.println("222222");
            /*服务器端给出反馈*/
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(serverSocket.accept().getOutputStream()));
            bufferedWriter.write("文件上传成功！");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            /*释放资源*/
            bw.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @author 段荣贵
     * @description //TODO RainGrd
     * @date 10:20:36 2022/4/13
     * @param 
     * @return 
     * 方法描述：服务器：接收的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
     **/
    @org.junit.Test
    public void test12(){

    }
}
