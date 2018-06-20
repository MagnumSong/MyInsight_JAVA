package cn.studyjava.day09;

/*
* 新的关键字 private 私有  属于成员修饰符，不能修饰局部变量
* 被private修饰的成员，只能在自己的本类中被使用
*
* 对私有变量，提供公共的访问方式：方法
* */
public class Person {
    // 人的姓名
    String name;
    // 人的年龄
    private int age;

    // 变量age被私有，提供方法，让外面的类使用
    public void setAge(int age){
        // 对变量参数a进行范围的限定
//        if (a<0 || a>200){
//            // 如果超过范围，手动将age赋值为20
//            age = 20;
//        } else {
//            // 如果a没有超过范围，直接对age赋值
//            age = a;
//        }
        this.age = age;
    }

    // 对变量age获取值使用，方法名字get
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 定义人的说话功能，方法中，要求说出自己的姓名和年龄
    public void speak() {
        String name = "哈哈";
        int age = 16;

        System.out.println("人在说话"+this.name+"..."+this.age);
        System.out.println(name+"..."+age);
    }
}
