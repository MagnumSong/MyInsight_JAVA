package cn.studyjava.day24;

import java.io.IOException;

public class Day24 {

    // 定义主方法
    public void day24_main(String[] args){
        // 转换流

        InputStreamReaderDemo inputStreamReaderDemo = new InputStreamReaderDemo();
        try {
            inputStreamReaderDemo.inputStreamReaderDemo_main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputStreamWriterDemo outputStreamWriterDemo = new OutputStreamWriterDemo();
        try {
            outputStreamWriterDemo.outputStreamWriterDemo_main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
