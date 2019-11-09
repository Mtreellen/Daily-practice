package com.ellen.chitchat.server.single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ellen
 * @date 2019-11-08 14:53
 * @description : 聊天室服务端程序
 */
public class SingleThreadServer {
    public static void main(String[] args) {
        try {
            // 1.创建 ServerSocket 对象
            // 1.1 通过命令行获取服务器端口号
            int port = 8888;
            if(args.length > 0){
                try {
                    port = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    System.out.println("端口参数不正确，使用默认端口: " + port);
                }
            }
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务器启动：" + serverSocket.getLocalSocketAddress());
            // 2.等待客户端连接
            System.out.println("等待客户端连接...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端信息：" + clientSocket.getRemoteSocketAddress());
            //  3.接收、发送数据
            //  3.1. 接收数据
            InputStream clientSocketInput = clientSocket.getInputStream();
            Scanner scanner = new Scanner(clientSocketInput);
            String clientData = scanner.next();
//            String clientData = scanner.nextLine();
            System.out.println("来自客户端的消息：" + clientData);
            //  3.2. 发送数据
            OutputStream clientSocketOutput = clientSocket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(clientSocketOutput);
            writer.write("你好，欢迎连接服务器~~\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 服务器端关闭
    }
}
