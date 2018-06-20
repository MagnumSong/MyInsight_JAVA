package cn.studyjava.day09;

public class Day09 {

    // 定义主方法
    public void day09_main(String[] args) {
        // 创建Car类的对象
        Car car = new Car();
        car.color = "RED";
        car.count = 4;
        car.run();

        // 创建Person类的对象
        Person person = new Person();
        // 对成员变量赋值
        person.setAge(20);
        //person.setName("张三");

        person.speak();
        //System.out.

    }

}
