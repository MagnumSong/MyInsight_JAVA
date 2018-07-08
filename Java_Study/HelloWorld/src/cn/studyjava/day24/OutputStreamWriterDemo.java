package cn.studyjava.day24;

import java.io.*;

public class OutputStreamWriterDemo {

    public void outputStreamWriterDemo_main(String[] args) throws IOException{

        writeUTF();
        writeGBK();
    }
    /*
    * 转换流，OutputStreamWriter写文本
    * 采用UTF-8编码表写入
    * */
    public static void writeUTF() throws IOException {
        // 创建字节流，绑定文件
        FileOutputStream fileOutputStream = new FileOutputStream("");
        // 创建转换流对象，构造方法保证字节输出流，并指定编码表是UTF-8
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

        outputStreamWriter.write("您好");

        outputStreamWriter.close();
    }

    /*
    * 转换流，OutputStreamWriter
    * 采用系统默认编码表GBK写入
    * */
    public static void writeGBK() throws IOException {
        // 创建字节输出流，绑定输出文件
        FileOutputStream fileOutputStream = new FileOutputStream("");
        // 创建转换流对象，构造方法，绑定字节输出流，使用GBK编码表
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        outputStreamWriter.write("您好");

        outputStreamWriter.close();
    }
}
