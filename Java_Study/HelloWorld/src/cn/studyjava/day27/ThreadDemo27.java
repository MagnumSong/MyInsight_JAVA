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

        // Demo1
        /*
        * 多线程并发访问同一个数据资源
        * 3个线程，对一个票资源，出售
        * */
        // 创建Runnable接口实现类对象
        Tickets_1 tickets_1 = new Tickets_1();
        // 创建3个Thread类对象，传递Runnable接口实现类
        Thread thread1_0 = new Thread(tickets_1);
        Thread thread1_1 = new Thread(tickets_1);
        Thread thread1_2 = new Thread(tickets_1);

        thread1_0.start();
        thread1_1.start();
        thread1_2.start();

        // Demo2
        // 创建Runnable接口实现类对象
        Tickets_2 tickets_2 = new Tickets_2();
        // 创建3个Thread类对象，传递Runnable接口实现类
        Thread thread2_0 = new Thread(tickets_2);
        Thread thread2_1 = new Thread(tickets_2);
        Thread thread2_2 = new Thread(tickets_2);

        thread2_0.start();
        thread2_1.start();
        thread2_2.start();


    }

}
