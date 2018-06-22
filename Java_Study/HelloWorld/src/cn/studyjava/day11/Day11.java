package cn.studyjava.day11;

import cn.studyjava.day09.Student;

public class Day11 {

    // 定义主方法
    public void day11_main(String[] args){

        // 创建接口实现类的对象
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.function();

        // 使用接口中定义常量
        // 常量被静态修饰，可以被类名直接调用，被类口名字直接调用
        System.out.println(MyInter.x);

        MyInterImpl myInter = new MyInterImpl();
        myInter.show();
        myInter.getSum(2,4);

        MyInterImplC myInterImplC = new MyInterImplC();
        myInterImplC.functionA();
        myInterImplC.functionB();
        myInterImplC.functionD();

        MyInterImplD myInterImplD = new MyInterImplD();
        myInterImplD.functionA();
        myInterImplD.functionB();
        myInterImplD.functionC();

        // 多态调用方法，方法必须运行子类的重写
        // 公式：父类类型或者是接口类型 变量=new 子类的对象()
        FuQin fuQin = new FuQin();
        fuQin.show();

        // 抽象类Animal 子类Cat
        Animal animal = new Cat();
        animal.eat();

        // 接口Smoke 实现类XueSheng
        Smoke smoke = new XueSheng();
        smoke.smoking();

        /*
        * 多态中，成员变量
        *
        * 成员变量：
        * 编译的时候，参考父类中有没有这个变量，如果有，编译成功，没有编译失败
        * 运行的时候，运行的是父类的变量值
        * 编译运行全看父类
        *
        * 成员方法：
        * 编译的时候，参考父类中有没有这个方法，如果有，编译成功，没有编译失败
        * 运行的时候，运行的是子类的重写方法
        * 编译看父类，运行看子类
        * */
        FuQin fuQin1 = new FuQin();
        System.out.println(fuQin1.a);
        fuQin1.show();


        // 两个子类，使用两次多态调用
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        // animal1,animal2调用子类父类共同方法，运行子类的重写
        animal1.eat();
        animal2.eat();

        // 类型向下转型，强制转换，调用子类的特有
        // 防止发生异常，animal1属性Cat对象，转成Cat类，animal2属于Dog对象，转成Dog类
        if (animal1 instanceof Cat){
            Cat cat = (Cat)animal1;
            cat.catchMouse();
        }
        if (animal2 instanceof Dog){
            Dog dog = (Dog)animal2;
            dog.lookHome();
        }


        // 创建笔记本对象，调用笔记本的功能
        Computer computer = new Computer();
        computer.openComputer();

        // 调用笔记本使用USB设备的方法
        // 参数，是USB接口类型，接口不能建立对象
        // 调用方法，传递USB接口的实现类的对象
        Mouse mouse = new Mouse();
        computer.useUSB(new Mouse());
        // 使用USB设备，使用键盘
        computer.useUSB(new Keyboard());

        computer.closeComputer();
    }


}
