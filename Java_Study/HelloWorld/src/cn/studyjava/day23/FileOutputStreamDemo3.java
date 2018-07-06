package cn.studyjava.day23;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* IO流的异常处理
* try catch finally
*
* 细节：
*   1.保证流对象变量，作用于足够
*   2.catch里面，怎么处理异常
*       输出异常的信息，目的看到哪里出现了问题
*       停下程序，重新尝试
*   3.如果流对象建立失败，需要关闭资源么？
*       new 对象的时候，失败了，没有占用系统资源
*       释放资源的时候，对流对象判断null
*       变量不是null，对象建立成功，需要关闭资源
*
* */

public class FileOutputStreamDemo3 {

    public void fileOutputStreamDemo3_main(String[] args) {
        //
        FileOutputStream fileOutputStream = null;
        try {
            //
            fileOutputStream = new FileOutputStream("/Users/songmenglong/Desktop/WTF/c.txt");
            fileOutputStream.write(100);

        } catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件写入失败，重试");
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException ex){
                throw new RuntimeException("关闭资源失败");
            }
        }

    }



}
