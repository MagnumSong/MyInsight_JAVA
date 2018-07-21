package cn.studyjava.day22;

/*
* 方法的递归调用
*   方法自己调用自己
* 适用于，方法中运算的主题不变，但是运行的时候，参与运行的方法参数会发生变化
* 注意：
*   递归一定要有出口，必须可以让程序停下
*   递归的次数不能过多
*   构造方法禁止递归
* */
public class DiGuiDemo22 {

    public void diGuiDemo22_main(String[] args) {
        System.out.println(getFBNQ(12));
        System.out.println(getJieCheng(5));
        System.out.println(getSum(100));
    }


    /*
    * 方法递归：计算斐波那契数列
    * */
    public static int getFBNQ(int month) {
        if (month == 1) {
            return 1;
        }
        if (month == 2) {
            return 1;
        }
        return getFBNQ(month-1)+getFBNQ(month-2);
    }

    /*
    * 计算阶乘 5！
    * 5*4*3*2*1
    * */
    public static int getJieCheng(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getJieCheng(n-1);
    }

    /*
    * 计算 1+2+3...+100 = 5050
    * 计算规律：
    *   n+(n-1)+(n-2)
    *   100+(100-1)+(100-2)...+1
    * */
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n +getSum(n-1);
    }

}
