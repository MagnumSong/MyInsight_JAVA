package cn.studyjava.day22;

import java.io.File;

public class Day22 {

    // 定义主方法
    public void day22_main(String[] args){
        // 文件

        fileDemo0_0();



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

    public void fileDemo0_1() {



    }

    /*
    * File的构造方法
    * 三种重载形式
    * */
    public static void function0_1_0() {
        File file = new File("");
        System.out.println("");
    }


    public void fileDemo0_2() {



    }

    public void fileDemo0_3() {



    }

    public void fileDemo0_4() {



    }


}
