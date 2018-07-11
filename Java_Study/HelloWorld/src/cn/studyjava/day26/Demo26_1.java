package cn.studyjava.day26;

public class Demo26_1 {

    public void demo26_1_main(String[] args){
        // 程序中的主进程
        //System.out.println(0/0);
        function();
        System.out.println(Math.abs(-9));

    }

    public static void function(){
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }


}
