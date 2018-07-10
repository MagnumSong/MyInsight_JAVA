package cn.studyjava.day24;

import java.io.*;

public class BufferedWriterDemo {

    public void bufferedWriterDemo_main(String[] args) throws IOException {
        // 创建字符输出流，封装文件
        FileWriter fileWriter = new FileWriter("");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("你好");
        bufferedWriter.newLine(); // 写换行
        bufferedWriter.flush();

        bufferedWriter.write("我好");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.write("大家都好");
        bufferedWriter.flush();

        bufferedWriter.close();

    }



}
