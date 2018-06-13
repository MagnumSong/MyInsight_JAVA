public class Main {

    public static void main(String[] args) {
        // 打印进制
        daYinJinZhi();

        // 问题1 兔子问题
        int n1 = 10;
        System.out.println("第"+n1+"个月兔子总数为"+tuZiWenTi(n1));

        // 问题2：素数问题
        int m2 = 1;
        int n2 = 1000;
        int count2 = 0;
        //统计素数个数
        for(int i=m2;i<n2;i++){
            if(suShuWenTi(i)){
                count2++;
                System.out.print(i+" ");
                if(count2%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("在"+m2+"和"+n2+"之间共有"+count2+"个素数");

        // 问题3：水仙花数问题
        for(int i=100;i<1000;i++){
            if(shuiXianHuaShuWenTi(i))
                System.out.print(i+" ");
        }
        System.out.println();


        // 问题4：
        int n4 = 13;
        fenJieZhiYinShuWenTi(n4);

        // 问题5：
        int n5 = -1;
        try {
            n5 = Integer.parseInt(args[0]);
        }  catch(ArrayIndexOutOfBoundsException e){
            System.out.println("请输入成绩");
            return;
        }
        fenDuanBiaoShiWenTi(n5);

        // 问题6：


        // 问题7：


    }


    /**
     * 打印进制
     * */
    private static void daYinJinZhi() {
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
     *  题目1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
     *  程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
     * */
    private static int tuZiWenTi(int n) {
        if(n==1 || n==2)
            return 1;
        else
            // 此处使用递归了
            return tuZiWenTi(n-1)+tuZiWenTi(n-2);
    }


    /**
     * 问题2：素数问题
     * 题目：判断101-200之间有多少个素数，并输出所有素数。
     * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
     * */
    private static boolean suShuWenTi(int n) {
        boolean flag = true;
        if(n==1)
            flag = false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if((n%i)==0 || n==1){
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
        }
        return flag;
    }

    /**
     * 题目3：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
     * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
     * */
    private static boolean shuiXianHuaShuWenTi(int lotus) {
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n/100;
        n  -= m*100;
        sum = m*m*m;
        m = n/10;
        n -= m*10;
        sum += m*m*m + n*n*n;
        if(sum==lotus)
            return true;
        else
            return false;
    }

    /**
     * 题目4：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
     * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
     * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
     * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
     * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
     * */
    private static void fenJieZhiYinShuWenTi(int n) {
        System.out.print(n+"=");
        for(int i=2;i<n+1;i++){
            while(n%i==0 && n!=i){
                n/=i;
                System.out.print(i+"*");
            }
            if(n==i){
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * 题目5：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
     * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
     * */
    private static void fenDuanBiaoShiWenTi(int n) {
        if(n>100 || n<0)
            System.out.println("输入无效");
        else{
            String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
            System.out.println(n+str);
        }

    }

    /**
     *
     *
     * */




}
