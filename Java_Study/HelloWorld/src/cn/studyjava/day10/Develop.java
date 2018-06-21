package cn.studyjava.day10;

/*
* 定义研发部员工
* 属于员工类的一种，研发员工继承员工类
*
* 关键字 extends
* 子类Develop 父类Employee
* 子类自动继承父类中可继承的属性和方法
*
* 子类中，可以直接调用父类的成员
 */

public abstract class Develop extends Employee {
    // 在子类中，可定义方法
    public void markProduct(){
        System.out.println("可以研发产品");
    }
}
