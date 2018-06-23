package cn.studyjava.day12;

/*
* 网络工程师，维护部的
* 继承维护部类
* */

public class NetWorker12 extends Maintainer12{

    public NetWorker12(String name, String ID){
        super(name, ID);
    }

    public void work() {
        System.out.println(super.getName()+"..."+super.getID()+"...正在检查网络是否畅通");
    }
}
