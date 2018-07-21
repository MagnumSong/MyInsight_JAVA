package cn.studyjava.day22;

import java.io.File;
import java.io.IOException;

public class Day22 {

    // 定义主方法
    public void day22_main(String[] args) throws IOException {
        // 文件

        fileDemo0_0();

        fileDemo0_1();

        fileDemo0_2();

        fileDemo0_3();

        fileDemo0_4();
    }

    /*
    * java.io.File
    * 将操作系统中的，文件，目录(文件夹)，路径，封装成File对象
    * 提供方法，操作系统中的内容
    * File与系统无关的类
    * 文件 file
    * 目录 directory
    * 路径 path
    * */
    public void fileDemo0_0() {
        // File类的静态成员变量
        // 与系统有关的路径分隔符
        String separator = File.pathSeparator;
        System.out.println("系统文件分隔符... "+separator); // 是一个分号，目录的分割 Linux

        // 与系统有关的默认名称分隔符
        separator = File.separator;
        System.out.println("系统默认名称的分隔符..."+separator); // 向右\ 目录名称分割 Linux /

    }

    /*
    * Demo1
    * */
    public void fileDemo0_1() {
        // 方法0
        function0_1_0();
        function0_1_1();
        function0_1_2();
    }

    /*
    * File的构造方法
    * 三种重载形式
    * */
    /*
    * File(String pathName)
    * 传递路径名：可以写到文件夹，可以写到一个文件
    * */
    public static void function0_1_0() {
        File file = new File("");
        System.out.println("");
    }

    /*
    * File(String parent, String child)
    * 传递路径，传递字符串父路径，字符串自子路径
    * 好处，单独操作父路径和子路径
    * */
    public static void function0_1_1() {
        File file = new File("", "");
        System.out.println("");
    }

    /*
    * File(File parent, String child)
    * 传递路径，传递File类型的父路径，字符串子路径
    * 好处，父路径是File类型，父路径可以直接调用File类方法
    * */
    public static void function0_1_2() {
        File file = new File(new File(""), "");
        System.out.println("");
    }


    /*
    * Demo2
    * File类的创建和删除功能
    * 文件或目录
    * */
    public void fileDemo0_2() throws IOException {
        function0_2_0();
        function0_2_1();
        function0_2_2();
    }

    /*
    * File创建文件的功能
    * boolean createNewFile()
    * 创建的文件路径和文件名，在File构造方法中给出
    * 文件已经存在了，不再创建
    * */
    public static void function0_2_0() throws IOException {
        File file = new File("");
        boolean b = file.createNewFile();
        System.out.println(b);
    }

    /*
    * File创建文件夹的功能
    * boolean mkdirs() 创建多层文件夹
    * 创建的路径也在File构造方法中给出
    * 文件夹已经存在了，不再创建
    * */
    public static void function0_2_1() {
        File file = new File("");
        boolean b = file.mkdirs();
        System.out.println(b);
    }

    /*
    * File类的删除功能
    * boolean delete()
    * 删除的文件或文件夹，在File构造方法中给出
    * 删除成功返回true，删除失败返回false
    * 删除方法不走回收站，直接从硬盘中删除
    * 删除有风险，运行需谨慎
    * */
    public static void function0_2_2() {
        File file = new File("");
        boolean b = file.delete();
        System.out.println(b);
    }

    /*
    * Demo3
    * File类获取功能
    * */
    public void fileDemo0_3() {
        function0_3_0();
        function0_3_1();
        function0_3_2();
        function0_3_3();
    }

    /*
    * File类获取功能
    * String getName()
    * 返回路径中表示的文件或文件夹名
    * 获取路径中的最后部分的名字
    * */
    public static void function0_3_0() {
        File file = new File("");
        String name = file.getName();
        System.out.println(name);

        System.out.println(file.getPath());
        System.out.println(file);
    }

    /*
    * File类获取功能
    * long length()
    * 返回路径中表示的文件的字节数
    * */
    public static void function0_3_1() {
        File file = new File("");
        long length = file.length();
        System.out.println(length);
    }

    /*
    * File类获取功能
    * String getAbsolutePath() 返回String对象
    * File getAbsoluteFile() 返回File对象
    * 获取绝对路径
    * */
    public static void function0_3_2() {
        File  file = new File("");
        File absolute = file.getAbsoluteFile();
        System.out.println(absolute);
    }

    /*
    * File类的获取功能
    * String getParent() 返回String对象
    * File getParentFile() 返回File对象
    * 获取父类路径
    * */
    public static void function0_3_3() {
        File file = new File("");
        File parent = file.getParentFile();
        System.out.println(parent);
    }

    /*
    * File类的判断功能
    * */
    public void fileDemo0_4() {
        function0_4_0();
        function0_4_1();
    }

    /*
    * File判断功能
    * boolean exists()
    * 判断File构造方法中封装路径是否存在
    * 存在返回true，不存在返回false
    * */
    public static void function0_4_0() {
        File file = new File("");
        boolean b = file.exists();
        System.out.println(b);
    }

    /*
    * File判断功能
    * boolean isDirectory()
    * 判断File构造方法中封装的路径是不是文件夹
    * 如果是文件夹返回true，不是文件夹返回false
    *
    * boolean isFile()
    * 判断File构造方法中封装的路径是不是文件
    * */
    public static void function0_4_1() {
        File file = new File("");
        if (file.exists()) {
            boolean b = file.isDirectory();
            System.out.println(b);
        }
    }

    // 文件学习1
    




}
