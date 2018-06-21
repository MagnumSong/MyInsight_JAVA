package cn.studyjava.day10;

/*
* 定义员工类
*
* 内容都是所有子类的共同抽取
* 属性：姓名 员工号
* 方法：工作
*
* */

public abstract class Employee {
    // 定义成员变量 姓名
    private String name;
    // 员工好
    private String ID;


    public abstract void work();
//    {
//        System.out.println("员工在工作，辛辛苦苦把活儿干");
//    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
}

