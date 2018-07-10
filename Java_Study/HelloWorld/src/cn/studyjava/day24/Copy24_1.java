package cn.studyjava.day24;

import java.io.*;

/*
* 使用缓冲流对象，复制文本文件
* */
public class Copy24_1 {
    public void copy24_1_main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""));

        // 读取文本行，读一行，写一行，写换行
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

}
