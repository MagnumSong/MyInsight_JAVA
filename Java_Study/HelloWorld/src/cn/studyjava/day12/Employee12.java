package cn.studyjava.day12;

/*
* 员工类：
* 共性的抽取
* 姓名，编号，工作方法(抽象)
* */

public abstract class Employee12 {

    private String name;
    private String ID;

    // 构造方法
    public Employee12(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    // 抽象方法
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
