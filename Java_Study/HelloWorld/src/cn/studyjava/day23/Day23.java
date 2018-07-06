package cn.studyjava.day23;

import java.io.FileInputStream;
import java.io.IOException;

public class Day23 {

    // 定义主方法
    public void day23_main(String[] args) throws IOException {
        // 字节流
        FileOutputStreamDemo0 fileOutputStreamDemo0 = new FileOutputStreamDemo0();
        try {
            fileOutputStreamDemo0.fileOutputStreamDemo0_main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStreamDemo1 fileOutputStreamDemo1 = new FileOutputStreamDemo1();
        fileOutputStreamDemo1.fileOutputStreamDemo1_main(args);

        // 输入字节流
        FileInputStreamDemo0 fileInputStreamDemo0 = new FileInputStreamDemo0();
        fileInputStreamDemo0.fileInputStreamDemo0_main(args);

        FileInputStreamDemo1 fileInputStreamDemo1 = new FileInputStreamDemo1();
        fileInputStreamDemo1.fileInputStreamDemo0_main(args);


        WriterDemo writerDemo = new WriterDemo();
        writerDemo.writerDemo_main(args);

        ReaderDemo readerDemo = new ReaderDemo();
        readerDemo.readerDemo_main(args);

        Copy_0 copy_0 = new Copy_0();
        copy_0.copy_0_main(args);

        Copy_1 copy_1 = new Copy_1();
        copy_1.copy_1_main(args);

        Copy_2 copy_2 = new Copy_2();
        copy_2.copy_2_main(args);

    }


}
