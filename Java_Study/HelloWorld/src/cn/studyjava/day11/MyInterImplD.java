package cn.studyjava.day11;

/*
* 实现接口C 重写C接口的全部抽象方法
* 接口C类继承接口A、B
* 实现类D需重写接口类A、B、C的全部抽象方法
*
* 问：Java中有多继承吗？
* 类每有多继承
* 接口有多继承
* */

public class MyInterImplD implements MyInterC {
    @Override
    public void functionA() {
        System.out.println("接口多继承 重写接口A的方法");
    }

    @Override
    public void functionB() {
        System.out.println("接口多继承 重写接口B的方法");
    }

    @Override
    public void functionC() {
        System.out.println("接口多继承 重写接口C的方法");
    }
}
