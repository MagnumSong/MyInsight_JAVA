package cn.studyjava.day26;

/*
* 实现线程成功的另一个方法，接口实现
* 实现接口Runnable，重写run方法
* 调用Thread类的方法start()
* */

public class SubRunnable implements Runnable{

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("run..."+i);
        }
    }
}
