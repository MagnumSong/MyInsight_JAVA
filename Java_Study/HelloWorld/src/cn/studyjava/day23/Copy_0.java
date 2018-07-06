package cn.studyjava.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 将数据源 文件路径A
* 复制到 文件路径B 数据目的
*
* 字节输入流，绑定数据源
* 字节输出流，绑定输出目的
*
* 输入，能读取一个字节
* 输出，能写入一个字节
* */

public class Copy_0 {
    public void copy_0_main(String[] args){
        // 定义两个流的对象变量
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream =  null;

        try {
            // 建立两个流的对象，绑定数据源和数据目的
            fileInputStream = new FileInputStream("/Users/songmenglong/Desktop/WTF/a.txt");
            fileOutputStream = new FileOutputStream("/Users/songmenglong/Desktop/服务器/a.txt");
            // 字节输入流
            int len = 0;
            while ((len = fileInputStream.read()) != -1) {
                fileOutputStream.write(len);
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("文件复制失败");
        } finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException("对象释放失败");
            } finally {
                try {
                    if (fileInputStream == null){
                        fileInputStream.close();
                    }
                } catch (IOException ex) {
                    throw new RuntimeException("释放对象失败");
                }
            }
        }





    }
}
