package cn.studyjava.day24;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 字节输出流的缓冲流
* java.io.BufferedOutputStream 作用：提高原有输出流的写入效率
* BufferedOutputStream 继承OutputStream
* 方法，写入write 字节 数组
*
* 构造方法：
* BufferedOutputStream(OutputStream out)
* 可以传递任意的字节输出流，传递的是哪个字节，就对哪个字节流提高效率
*
* FileOutputStream
* */
public class BufferedOutputStreamDemo {
    public void bufferedOutputStreamDemo_main(String[] args) throws IOException {
        // 创建字节流缓冲流的对象，构造方法中，传递字节输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));

        bufferedOutputStream.write(55);

        byte[] bytes = "Hello Mars".getBytes();
        bufferedOutputStream.write(bytes);

        bufferedOutputStream.write(bytes, 3, 2);
        bufferedOutputStream.close();
    }
}
