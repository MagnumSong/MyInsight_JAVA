package cn.studyjava.day24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* 字节输入流缓冲流
* java.io.FileReader 继承Reader
* 读取功能 read() 单个字符，字符数组
* */

public class BufferedReaderDemo {
    public void bufferedReaderDemo_main(String[] args) throws IOException {
        //
        int lineNumber = 0;
        // 创建字符输入流缓冲流对象，构造方法传递字符输入流，包装数据源文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
        // 调用缓冲流的文件，readLine()读取文本行
        // 循环读取文本行，结束条件 readLine()返回null
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lineNumber++;
            System.out.println(lineNumber + "..." +line);
        }
        bufferedReader.close();
    }

}
