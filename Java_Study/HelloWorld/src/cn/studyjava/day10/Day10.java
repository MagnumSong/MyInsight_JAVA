package cn.studyjava.day10;

import com.sun.tools.corba.se.idl.constExpr.And;

public class Day10 {

    // 定义主方法
    public void day10_main(String[] args){
        /*
        * 继承的概念
        *
        * 抽象类
        *
        *
        *
        *
        *
        *
        * */

//        Develop develop = new Develop();
//        develop.name = "张三李四";
//        develop.markProduct();
//        develop.work();

        // 创建维护员工类的对象
//        WeiHu weiHu = new WeiHu();
//        weiHu.name = "比尔盖茨";
//        weiHu.weiHuName();
//        weiHu.work();

        Son son = new Son();
        son.show();

        Phone phone = new Phone();
        phone.call();
        phone.sendMessage();
        phone.showNum();

        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.showNum();

        // 抽象类
        JavaEE javaEE = new JavaEE() {};
        javaEE.setName("亚历山大");
        javaEE.setID("890");
        javaEE.work();

    }



}
