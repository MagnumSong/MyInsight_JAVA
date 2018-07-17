package cn.studyjava.day27;

/*
* 定义资源类，有2个成员变量
* name sex
* 同时有2个线程，对资源中变量操作
* 1个对name，sex赋值
* 2个对name，sex做变量的输出打印
* */

public class Resource27 {
    public String name;
    public String sex;
    public boolean flag = false;
}
