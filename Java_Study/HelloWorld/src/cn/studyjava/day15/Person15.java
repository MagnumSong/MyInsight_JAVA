package cn.studyjava.day15;

public class Person15 extends Object {
    private String name;
    private int age;

    // 构造方法
    public Person15(){

    }

    //
    public Person15(String name,int age){
        this.name = name;
        this.age = age;
    }

    /*
    * 重写父类的方法toString
    * 没有必要让调调用者看到内存地址
    * 要求：方法中，返回类中所有成员变量的值
    * */
    public String toString() {
        return name+age;
    }

    /*
        * 将父类的equals方法写过来，重写父类的方法
        * 但是，不改变父类方法的源码，方法equals 比较两个对象的内存地址
        *
        * 两个对象，比较地址，没有意思
        * 比较两个对象的成员变量，age
        * 两个对象变量age相同，返回true，不同返回false
        *
        * 重写父类的equals方法，自己定义对象的比较方式
        * */
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        // 对参数object，非空判断
        if (object == null){
            return false;
        }
        if (object instanceof Person15){
            // 参数object接受到的是Person15对象，才能转型
            // 对object参数进行类型的向下转型，object转成Person15类型
            Person15 person15 = (Person15)object;
            return this.age == person15.age;
        }
        return false;
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
