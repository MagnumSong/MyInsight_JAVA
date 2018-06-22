package cn.studyjava.day11;

/*
* 定义类 实现接口 重写接口的抽象方法
* 创建实现类的对象
*
* 类内实现接口 可以理解为继承
*
* 关键implements
*
* */


public class MyInterfaceImpl implements MyInterface {

    @Override
    public void function() {
        System.out.println("实现类 重写接口抽象方法");
    }
}
