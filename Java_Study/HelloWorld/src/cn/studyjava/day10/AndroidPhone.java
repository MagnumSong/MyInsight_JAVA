package cn.studyjava.day10;

public class AndroidPhone extends Phone {
    public void showNum(){
        // 子类直接用父类方法
        super.showNum();

        System.out.println("显示姓名");
        System.out.println("显示大头像");
    }


}
