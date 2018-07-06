package cn.studyjava.day23;

/*
* 字符输入流读取文本文件，所有字符输入流的超类
* java.io.FileReader
* 专门读取文本文件
*
* 读取文件：read()
* int read 读取1个字符
* int read(char c) 读取字符数组
*
* Reader类是抽象类，找到子类对象 FileReader
*
* 构造方法：绑定数据源
*   参数：
*       File 类型对象
*       String 文件名
*
* */

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public void readerDemo_main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/songmenglong/Desktop/WTF/a.txt");

//        int length = 0;
//        while ((length = fileReader.read()) != -1){
//            System.out.println((char)length);
//        }

        char[] chars = new char[1024];
        int len = 0;
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fileReader.close();

    }
}
