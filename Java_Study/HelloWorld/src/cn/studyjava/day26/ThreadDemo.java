package cn.studyjava.day26;

/*
* 创建和启动一个线程
* 创建Thread子类对象
* 子类对象调用start()
* 让线程程序执行，JVM调用线程的run
* */

/*
* 每个线程都有自己的名字
* 运行方法main线程，名字就是"main"
* 其他新建的线程也有名字，默认"Thread-0","Thread-2"
*
* JVM开启主进程，运行方法main，主线程也是线程，是线程必然是
* Thread类对象
* Thread类中，静态方法
* static Thread currentThread() 返回正在执行的线程对象
* */

public class ThreadDemo {
    public void threadDemo_main(String[] args) {
        SubThread subThread = new SubThread();
        SubThread subThread1 = new SubThread();

        subThread.start();
        subThread1.start();
        for (int i = 0; i < 50; i++) {
            //System.out.println("main..."+i);
        }


        NameThread nameThread = new NameThread();
        nameThread.setName("韩庚");
        nameThread.start();

        System.out.println(Thread.currentThread().getName());

        new SleepThread().start();

        SubRunnable subRunnable = new SubRunnable();
        Thread thread = new Thread(subRunnable);

        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main..."+i);
        }

        /*
        * 使用匿名内部类，实现多线程程序
        * 前提：继承或者接口实现
        * new 父类或者接口(){
        *   重写抽象方法
        * }
        * */
        // 继承方式
        new Thread(){
            public void run() {
                System.out.println("!!!");
            }
        }.start();

        // 实现接口方式
        Runnable runnable = new Runnable(){
            public void run() {
                System.out.println("###");
            }
        };
        new Thread(runnable).start();

        new Thread(new Runnable() {
            public void run() {

            }
        }).start();
    }
}
