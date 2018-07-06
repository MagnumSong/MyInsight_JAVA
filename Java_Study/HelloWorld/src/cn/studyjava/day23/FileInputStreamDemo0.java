package cn.studyjava.day23;

/*
* FileInputStream读取文件
*
* 构造方法：为这个流对象绑定数据
*   参数：
*       File类型对象
*       String对象
*
*   输入流读取文件的步骤：
*       1.创建字节输入流的子类对象
*       2.调用读取方法read()读取
*       3.关闭资源
*
* read()方法
*   read()只执行一次，就会自动读取下一个字节
*   返回值，返回的是读取到的字节，读取到结尾返回结果-1
* */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo0 {
    public void fileInputStreamDemo0_main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/songmenglong/Desktop/WTF/a.txt");
        // 读取一个字节，调用方法read，返回int
        // 使用循环方式，读取文件，循环结束的条件，read()方法返回-1
        int len = 0; // 接受read方法的返回值

        while ((len = fileInputStream.read()) != -1) {
            System.out.println((char)len);
        }

        // 关闭资源
        fileInputStream.close();

    }
    
}
