package cn.studyjava.day10;

/*
* 定义网络工程师
* 抽象类
* */

public abstract class Network extends Employee {
    @Override
    public void work() {
        System.out.println("网络工程师检查网络是否畅通");
    }
}
