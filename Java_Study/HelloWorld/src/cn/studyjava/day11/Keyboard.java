package cn.studyjava.day11;

public class Keyboard implements USB {
    public void open(){
        System.out.println("开启键盘");
    }

    public void close() {
        System.out.println("关闭键盘");
    }
}
