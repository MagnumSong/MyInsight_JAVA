package cn.studyjava.day23;

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


    }


}
