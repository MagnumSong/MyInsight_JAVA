package cn.studyjava.day01;


public class Day01 {
    public void day01_main(String[] args) {
        // 第一天的主方法入口

        printCode();

    }

    /*
    * 标识符的规则A-Z,a-z,0-9,_下划线,$美元符号
    * 注意：不能数字开头，不能是关键字
    *
    * 类的名字：首字母大写，第二个单词首字母大写
    * PersonInfo
    *
    * 方法的名字：首字母小写，第二个单词及后面的没个单词都大写
    * addStudent
    *
    * */

    /*
    * 输出整数常量，小数常量，布尔常量，字符常量，字符串常量
    *
    * */

    public void printCode() {
        // 输出整数，十进制
        System.out.println(50);

        // 输出整数，二进制，数字开头0B
        System.out.println(0B11);

        // 输出整数，八进制
        System.out.println(051);

        // 输出整数，十六进制，数据开头0X，0-9 A-F
        System.out.println(0XE);

        // 输出浮点数据
        System.out.println(5.0);

        // 输出布尔数据，只有两个值，true、false 关键字
        System.out.println(true);
        System.out.println(false);

        // 输出字符串常量，单引号包裹，可以写1个字符
        System.out.println('a');

        // 输出字符串常量，双引号包裹，可以写0-n个字符
        System.out.println("HelloWorld");
    }

    /*
    * 负数的二进制
    * 如果确定了机器的字节长，那么首位就代表符号位，
    * 如果首位是0，代表这个二进制是整数
    * 如果首位是1，代表着个数是负数
    *
    * 负数的二进制是取它的补码，补码是这个数字的正数按位取反再加1
    * 1的二进制
    *  0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0001
    *
    *  然后取它的反码
    *  1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1110
    *
    *  然后再把反码加1
    *  1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111
    * 这个就是-1的二进制
    * */

}