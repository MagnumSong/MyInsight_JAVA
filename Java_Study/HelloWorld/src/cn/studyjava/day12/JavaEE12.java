package cn.studyjava.day12;

/*
* 定义JavaEE工程师类
* 属于研发部员工，继承研发部
* */

public class JavaEE12 extends Developer12 {
    public JavaEE12(String name, String ID){
        super(name, ID);
    }

    public void work() {
        System.out.println(super.getName()+"..."+super.getID()+"...开发了诺基亚");
    }
}
