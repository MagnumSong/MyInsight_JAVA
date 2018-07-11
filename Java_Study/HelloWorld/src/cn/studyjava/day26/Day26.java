package cn.studyjava.day26;

public class Day26 {



    // 定义主方法
    public void day26_main(String[] args) throws Exception{


        // 多线程
        Demo26_1 demo26_1 = new Demo26_1();
        //demo26_1.demo26_1_main(args);

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.threadDemo_main(args);

        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        threadPoolDemo.threadPoolDemo_main(args);

    }

}
