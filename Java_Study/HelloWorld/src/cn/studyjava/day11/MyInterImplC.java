package cn.studyjava.day11;

/*
* 类C，同时实现2个接口，接口A、B
* 作为实现类C，全部重写两个接口的所有抽象方法，才能建立C类的对象
*
* C类，在继承一个类的同时，可以实现多个接口
* */

public class MyInterImplC extends AbstractD implements MyInterA,MyInterB {

    @Override
    public void functionA() {
        System.out.println("重写 接口类A的方法");
    }

    @Override
    public void functionB() {
        System.out.println("重写 接口类B的方法");
    }

    @Override
    public void functionD() {
        System.out.println("重写 抽象类D的方法");
    }
}
