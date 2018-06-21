package cn.studyjava.day10;

/*
* 继承后，子类父类中，成员变量的特点
* Son extends Father
*
* 子类的对象，调用成员变量
*  子类自己有，使用自己的
*  子类没有，调用父类的
*
* 在子类中，调用父类的成员，关键字，super.调用父类的成员
* 子类(派生类)继承父类(超类，基类)
*
* this.调用自己本类的成员
* super.调用自己父类的成员
*
* 重载：方法名一样，参数列表不同，同一个类的事情
*
*
* */

public class Son extends Father {

    int i = 2;

    public void show(){
        int i = 3;
        System.out.println("父类的i = "+super.i);
        System.out.println("子类的i ="+this.i);
        System.out.println("方法内变量 i ="+i);
    }
}
