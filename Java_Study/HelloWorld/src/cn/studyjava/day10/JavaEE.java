package cn.studyjava.day10;

public abstract class JavaEE extends Employee {
    // 重写父类的抽象方法
    public void work() {
        // 调用父类的get方法
        System.out.println("Java工程师 开发自己的产品了"+super.getName()+"...员工号："+super.getID());
    }
}
