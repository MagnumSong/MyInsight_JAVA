package cn.studyjava.day11;

/*
* 接口与接口之间，是继承关系
* Java支持接口的多继承，一个接口可以同时继承多个接口
* */

public interface MyInterC extends MyInterA, MyInterB {
    public abstract void functionC();
}
