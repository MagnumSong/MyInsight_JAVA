package cn.studyjava.day26;

public class ThreadPoolRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 提交线程任务");
    }
}
