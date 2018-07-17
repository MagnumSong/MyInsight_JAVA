package cn.studyjava.day27;

/*
* Demo0
* 通过线程休眠，出现安全问题
* 解决安全问题，Java技术，提供技术，同步技术
* 公式：
*   synchronized(任意对象){
*      线程要操作的共享数据
*   }
*   同步代码块
* */

public class Tickets implements Runnable {

    // 定义出售的票源
    private int ticket = 100;
    private Object object = new Object();

    public void run() {
        while (true) {
            // 线程共享数据，保证安全，加入同步代码块
            synchronized (object) {
                // 对票数判断，大于0，可以出售，变量--操作
                if (ticket > 0) {
                    try{
                        Thread.sleep(10);
                    } catch (Exception ex) {
                        System.out.println(Thread.currentThread().getName()+" 出售第"+ticket--);
                    }
                }
            }
        }
    }
}


