package cn.studyjava.day23;

/*
* FileOutputStream
* 写入数据文件，学习父类方法，使用子类对象
*
* 子类中的构造方法，作用绑定数据的输出目的
* 参数：
*   File    封装文件
*   String  字符串的文件名
*
* 流对象的步骤：
*  1.创建流子类的对象，绑定数据目的
*  2.调用流对象的方法write写
*  3.close释放对象
*
* 流对象的构造方法，可以创建文件，如果文件存在，直接覆盖
*
* */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo0 {


    public void fileOutputStreamDemo0_main(String[] args) throws IOException {
        // 写入本地文件
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/songmenglong/Desktop/WTF/a.txt");
        // 流对象的方法write写数据
        // 写一个字节
        fileOutputStream.write(97);

        byte[] bytes = {65,66,67,68};
        fileOutputStream.write(bytes);

        // 写字节数组的一部分，开始索引，写几个
        fileOutputStream.write(bytes, 1, 2);

        // 写入字节数组的简便方式
        fileOutputStream.write("helloworld".getBytes());

        // 关闭资源
        fileOutputStream.close();

    }
}
