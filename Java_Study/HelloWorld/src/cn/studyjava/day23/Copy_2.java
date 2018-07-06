package cn.studyjava.day23;

/*
* 字符流复制文本文件，必须文本文件
* 字符流查询本机默认的编码表，简体中文GBK
* FileReader 读取数据源
* FileWriter 写入到数据目的
* */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_2 {
    public void copy_2_main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("/Users/songmenglong/Desktop/WTF/a.txt");
            fileWriter = new FileWriter("/Users/songmenglong/Desktop/WTF/a.txt");

            char[] charsBuf = new char[1024];
            int len = 0;
            while ((len = fileReader.read(charsBuf)) != -1){
                fileWriter.write(charsBuf, 0, len);
                fileWriter.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        } finally {
            try {
                if (fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fileReader != null){
                        fileReader.close();
                    }
                } catch (IOException ex) {
                    //throw new RuntimeException("释放资源失败");
                }
            }
        }
    }


}
