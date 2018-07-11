package cn.studyjava.day26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {

    public void threadPoolDemo_main(String[] args) throws Exception {
        // 调用工厂类的静态方法，创建线程池对象
        // 返回线程池对象，是返回的接口
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 调用接口实现类对象executorService中的方法submit提交线程任务
        // 将Runnable接口实现类对郗那个，传递
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());


        /*
        * 实现线程程序的第三个,实现Callable接口方式
        * 实现步骤
        *   工厂类 Executor静态方法newFixedThreadPool方法，创建线程池对象
        *   线程池对象ExecutorService接口实现类，调用方法submit提交线程任务
        *   submit(Callable c)
        * */

        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        // 提交线程任务的方法submit方法返回，Future接口的实现类
        Future<String> future = executorService1.submit(new ThreadPoolCallable());
        String string = future.get();

        System.out.println(string);
    }
}
