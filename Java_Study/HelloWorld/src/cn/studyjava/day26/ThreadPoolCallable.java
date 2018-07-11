package cn.studyjava.day26;

import java.util.concurrent.Callable;

/*
* Callable 接口的实现类，作为线程提交任务出现
* 使用方法返回值
* */

public class ThreadPoolCallable implements Callable<String> {

    public String call() throws Exception {
        return "abc";
    }
}
