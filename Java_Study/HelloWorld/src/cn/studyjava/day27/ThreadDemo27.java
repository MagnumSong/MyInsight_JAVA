package cn.studyjava.day27;

/*
* 多线程并发访问同一个数据资源
* 3个线程，对一个票资源，出售
* */

public class ThreadDemo27 {
    public void threadDemo27_main(String[] args) {
        // 创建Runnable接口实现类对象
        Tickets tickets = new Tickets();
        // 创建3个Thread类对象，传递Runnable接口实现类
        Thread thread0 = new Thread(tickets);
        Thread thread1 = new Thread(tickets);
        Thread thread2 = new Thread(tickets);

        thread0.start();
        thread1.start();
        thread2.start();
    }

}
