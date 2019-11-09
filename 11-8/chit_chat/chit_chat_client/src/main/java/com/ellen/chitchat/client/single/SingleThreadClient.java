package com.ellen.chitchat.client.single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ellen
 * @date 2019-11-08 15:06
 * @description : 聊天室的客户端程序
 */
public class SingleThreadClient {
    public static void main(String[] args) {
        Socket clientSocket = null;
        OutputStream clientSocketOutput = null;
        InputStream clientSocketInput = null;
        try {
            // 1.创建客户端，连接到服务器
            // 1.1 通过命令行获取参数
            int port = 8888;
            if(args.length > 0){
                try {
                    port = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    System.out.println("端口参数不正确，使用默认端口: " + port);
                }
            }
            String host = "127.0.0.1";
            if(args.length > 1){
                host = args[1];
                // host格式校验
            }
            clientSocket = new Socket(host,port);
            // 2.发送数据、接收数据
            // 2.1 发送数据
            clientSocketOutput = clientSocket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(clientSocketOutput);
            writer.write("你好，我是客户端\n");//注意换行问题，服务器端读取数据nextLine()
            writer.flush();// 刷新
                             // printStream
            // 2.2 接收数据
            clientSocketInput = clientSocket.getInputStream();
            Scanner scanner = new Scanner(clientSocketInput);
            String serverData = scanner.nextLine();
            System.out.println("来自服务端的数据:" + serverData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭客户端
            if(clientSocketInput != null){
                try {
                    clientSocketInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(clientSocketOutput != null){
                try {
                    clientSocketOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(clientSocket != null){
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("客户端关闭");
        }

    }
}
