package cn.studyjava.day12;

import cn.studyjava.day09.Person;

public class Day12 {

    // 定义主方法
    public void day12_main(String[] args){

        // new对象的时候，就是在调用对象的构造方法
        // new Person12(); 调用的类中的空参数构造方法
        // new Person12("吉姆", 122); 调用的类中的有参数构造方法
        Person12 person12 = new Person12("吉姆", 122);
        System.out.println(person12.getName());
        System.out.println(person12.getAge());


        Person12 person121 = new Person12();
        person121.setName("汤姆");
        person121.setAge(12);
        System.out.println(person121.getName()+"...."+person121.getAge());

        // 常见JavaEE对象，调用方法
        JavaEE12 javaEE12 = new JavaEE12("张三", "开发部003");
        javaEE12.work();

        // 创建Net对象，调用方法
        NetWorker12 netWorker12 = new NetWorker12("小红","维护部033");
        netWorker12.work();

    }

}
