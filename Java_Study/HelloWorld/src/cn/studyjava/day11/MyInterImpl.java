package cn.studyjava.day11;

public class MyInterImpl implements MyInter {
    // 重写接口中的抽象方法，public权限是必须的
    //@Override
    public void show() {
        System.out.println("给你看啥子呢？わからない");
    }

    //@Override
    public int getSum(int a, int b) {
        System.out.println("获取int数值a+b的和："+ (a+b));
        return a+b;
    }
}
