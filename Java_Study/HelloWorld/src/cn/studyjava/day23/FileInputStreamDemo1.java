package cn.studyjava.day23;

/*
* FileInputStream读取文件
*   读取文件 int read(byte[] b) 读取字节数组
*   数组作用：缓冲的作用，提高效率
*   read返回的int，表达什么含义，读取到多少个有效字节数
* */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public void fileInputStreamDemo0_main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/songmenglong/Desktop/WTF/a.txt");

        // 创建字节数组
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1 ) {
            System.out.println(new String(bytes, 0, len));
        }

        fileInputStream.close();
    }
}
