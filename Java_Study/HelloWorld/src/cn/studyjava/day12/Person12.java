package cn.studyjava.day12;

/*
* 要求在new Person12(创建对象)的同时，就指定好name、age的值，
* 实现功能，利用方法去实现，构造方法，构造器 Constructor
* 作用：在new的同时对成员变量赋值，给对象的属性初始化赋值
*
* 构造方法的定义格式：
* 权限 方法名(参数列表){
* }
* 方法的名字必须和类名完全一致
* 构造方法不允许写返回值类型，void也不能写
*
* 构造方法在什么时候运行呢？在new的时候，自动执行
* 只运行一次，仅此而已
*
* 每个class必须拥有构造方法，构造方法不写也有
* 编译的时候javac会自动检查类中是否有构造方法
* 如果有，就如下的构造方法
* 如果没有，编译器会自动添加一个构造方法
*   编译器自动添加的构造方法:public Person12(){}
*  自己手写了构造方法，编译的时候，不会自动添加构造方法
* */

import cn.studyjava.day09.Person;

public class Person12 {
    private String name;
    private int age;

    // 写空参数的构造方法
    public Person12(){
        // 调用有参数的构造方法
        // 参数"张无忌",20 传递给name,age
        this("张无忌",13);
        System.out.println("我是一个空参数构造方法");
    }

    // 定义Person类的构造方法
    public Person12(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
