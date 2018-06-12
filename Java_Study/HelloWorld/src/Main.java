public class Main {

    public static void main(String[] args) {

        printJinZhi();

        //
        int n = 10;
        System.out.println("第"+n+"个月兔子总数为"+febonacciFunc(n));



    }


    /**
     * 打印进制
     * */
    private static void printJinZhi() {

        //输出整数 十进制
        System.out.println(50);

        //输出整数，二进制, 数字开头0B
        System.out.println(0B11);

        //输出整数，八进制，数字开头0
        System.out.println(051);

        //输出整数，十六进制，数组开头0X  0-9 A-F
        System.out.println(0XE);

        //输出浮点数据
        System.out.println(5.0);

        //输出布尔数据，只有2个值，true，false 关键字
        System.out.println(true);
        System.out.println(false);

        //输出字符常量，单引号包裹，只能写1个字符
        System.out.println('了');

        //输出字符串常量，双引号包裹，可以写0-n个字符
        System.out.println("HelloWorld");
    }

    /**
     *  斐波那次 兔子问题
     *  题目1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
     *  程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
     * */

    private  static int febonacciFunc(int n) {
        if(n==1 || n==2)
            return 1;
        else
            // 此处使用递归了
            return febonacciFunc(n-1)+febonacciFunc(n-2);
    }

    




}
