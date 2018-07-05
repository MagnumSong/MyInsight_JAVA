package cn.studyjava.day23;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* FileOutputStream 文件的续写和换行
* 续写：FileOutputStream构造方法的第二个参数，加入true
* 在文件中，写入换行，符号换行，\r\n
* */
public class FileOutputStreamDemo1 {

    public void fileOutputStreamDemo1_main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/songmenglong/Desktop/WTF/b.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);


        try {
            fileOutputStream.write("Hello".getBytes());

            // 
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
