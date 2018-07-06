package cn.studyjava.day23;

import java.io.FileWriter;
import java.io.IOException;

/*
* 字符输出流
* java.io.Writer 所有字符输出流的超类
* 写文件，写文本文件
*
* 写的方法 write
* write(int c) 写1个字符
* write(char[] c) 写字符数组
* write(char[] c,int,int) 字符数组一部分，开始索引，写几个
* write(String s) 写入字符串
*
* Write类的子类对象，FileWriter
*
* 构造方法：写入的数据类型
*   File 类型对象
*   String 文件名
*
* 字符输出流写数据的时候，必须要运行一个功能，刷新数据
* flush
* */

public class WriterDemo {
    public void writerDemo_main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/songmenglong/Desktop/WTF/a.txt");

        // 写1个字符
        fileWriter.write(100);
        fileWriter.flush();

        // 写一个字符数组
        char[] chars = {'a', 'b', 'c', 'd'};
        fileWriter.write(chars);
        fileWriter.flush();

        // 写字符数组的一部分
        fileWriter.write(chars, 2, 2);
        fileWriter.flush();

        // 写入字符串
        fileWriter.write("Wo Shi WYZ");
        fileWriter.flush();

        fileWriter.close();
    }
}
