package cn.studyjava.day24;

import java.io.*;

public class Copy24_0 {
    /*
    * 文件复制方式，字节流，一共4种方式
    *
    * */

    public void copy24_0_main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        copy_4(new File(""), new File(""));
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

    /*
    * 方法，实现文件复制
    * 4.字节流缓冲区流读取字节数组
    * */
    public static void copy_4(File src, File desc) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desc));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /*
    * 方法，实现文件复制
    * 3.字节流缓冲区流读取单个字节
    * */
    public static void copy_3(File src, File desc) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desc));

        int len = 0;
        while ((len = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /*
    * 方法，实现文件复制
    * 2.字节流读取字节数组
    * */
    public static void copy_2(File src, File desc) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(desc);

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /*
    * 方法，实现文件复制
    * 1.字节流读取单个字节
    * */
    public static void copy_1(File src, File desc) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(desc);

        int len = 0;
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
