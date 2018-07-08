package cn.studyjava.day24;

/*
* 转换流
* java.io.InputStreamReader 继承 Reader
* 字符输入流 读取文本文件
*
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public void inputStreamReaderDemo_main(String[] args) throws IOException{

        readUTF();
        readGBK();
    }

    /*
    * 转换流，InputStreamReader读取文本
    * 采用UTF-8编码表，读取文件utf
    * */
    public static void readUTF() throws IOException {
        // 创建字节输入流，传递文本
        FileInputStream fileInputStream = new FileInputStream("");
        // 创建转换流对象，构造方法，包装字节输入流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        char[] chars = new char[1024];
        int len = inputStreamReader.read(chars);

        System.out.println(new String(chars, 0, len));

        inputStreamReader.close();
    }

    /*
    * 转换流，InputStreamReader读取文本
    * 采用系统默认编码表，读取GBK文件
    * */
    public static void readGBK() throws IOException {
        // 创建字节输入流，传递文本
        FileInputStream fileInputStream = new FileInputStream("");
        // 创建转换流对象，构造方法，包装字节输入流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        char[] chars = new char[1024];
        int len = inputStreamReader.read(chars);

        System.out.println(new String(chars, 0, len));

        inputStreamReader.close();
    }


}
