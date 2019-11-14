package bufferstream.exer;

import java.io.*;

/**
 * @author ellen
 * @date 2019-11-14 10:06
 * @description：图片加密与解密
 */
public class EncryptDecrypt {
    public static void main(String[] args) throws IOException {
//        encryption();

        decryption();
    }

    // 加密
    private static void encryption() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("IO\\src\\z_filesrc\\1.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("IO\\src\\secret.jpg")));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            // 错误：增强for循环
            // 并没有修改 bytes 数组中元素的值
//            for (byte b : bytes){
//                b = (byte) (b ^ 5);// 加密
//            }
            for (int i = 0; i < len; i++) {
                bytes[i] = (byte)(bytes[i] ^ 5);
            }
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
    // 解密
    public static void decryption() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("IO\\src\\secret.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("IO\\src\\3.jpg")));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            for (int i = 0; i < len; i++) {
                bytes[i] = (byte)(bytes[i] ^ 5);// a ^ b = c
                                                // c ^ a = b
                                                // bytes[i] ^ 5 = tmp
                                                // tmp ^ 5 = bytes[i]
            }
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
