package cn.studyjava.day05;

import java.util.Random;
import java.util.Scanner;

public class Day05 {
    public void day05_main(String[] args){

        methodDemo_0();
        methodDemo_1();
        methodDemo_2();
        methodDemo_3();

        methodOverLoadDemo_0();
        methodOverLoadDemo_1();

        callName();
        shopping();
    }

    public void methodDemo_0(){
        int area = getArea(5, 6);
        System.out.println("调用方法后的结果： "+area);
    }

    public static int getArea(int w, int h){
        // 实现方法主体
        return w * h;
    }

    public void methodDemo_1(){
        // 求平均数
        double avg = getAvg(getNum(),getNum(),getNum());
        System.out.println("方法练习，求平均数： "+avg);
        // 输出区域面积
        printRect();
        printRectWithPara(5,9);
    }

    public static int getNum() {
        // 获取输入数据
        System.out.println("请您输入数据：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printRect(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRectWithPara(int m, int n){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static double getAvg(double a, double b, double c) {
        // 获取平均数
        return (a+b+c)/3;
    }

    public void methodDemo_2(){
        /*
        * 方法定义和使用的注意事项
        * 1 方法不能写在另一个方法里面
        * 2 写错方法的名字
        * 3 写错了参数列表
        * 4 方法返回值是void，方法中可以省略return不写 return下面不能有代码
        * 5 方法返回类型 和return后面的数据类型必须匹配
        * 6 方法重复定义的问题
        * 7 调用方法的时候 返回值是void 不能写在输出语句中
        * */

        int i = print();
        System.out.println(i);
    }

    public static int print(){
        return 1;
    }

    public void methodDemo_3(){
        /*
        * 方法调用中的参数传递问题
        * 1 方法参数是基本数据类型
        * 2 方法参数是引用数据类型 传递的是地址
        * */
        int a = 1;
        int b = 2;
        change(a, b);
        System.out.println(a);
        System.out.println(b);

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int[] arr){
        arr[2] = 100;
    }

    public static void change(int a, int b){
        a = a+b;
        b = b+a;
    }

    public void methodOverLoadDemo_0(){
        /*
        * 方法重载特性(overload)
        * 在同一个类中，允许出现同名的方法，只要方法的参数列表不同即可，这样的方法就是重载
        * 参数列表不同：参数的个数，数据类型，顺序
        * */

        // 对重载的调用，根据参数传递进行区分
        System.out.println();
        double sum = getSum(2.3, 3.5);
        System.out.println(sum);
    }

    // 对参数求和，利用方法的重载特性
    public static int getSum(int a, int b){
        System.out.println("两个int参数");
        return a+b;
    }

    public static int getSum(int a, int b, int c){
        System.out.println("三个int参数");
        return a+b+c;
    }

    public static double getSum(double a, double b){
        System.out.println("两个double参数");
        return a+b;
    }

    public void methodOverLoadDemo_1(){
        /*
        * 方法重载注意事项
        * 1 参数列表必须不同
        * 2 重载和参数变量名无关
        * 3 重载和返回类型值无关
        * 4 重载和修饰符无关
        * */
    }

    public void callName(){
        /*
        * 实现随机点名器
        * 1 存储所有学生的姓名
        * 2 预览所有学生的姓名，遍历数组
        * 3 随机数做索引到数组中找元素
        *
        * 将功能独立出来，作为方法，调用方法即可
        *
        * 定义三个功能，用到同一个姓名数据
        * 姓名存储到数组中，三个方法，使用一个数组中的数据，方法传递参数
        * */

        // 定义数组，存储学生的姓名
        String[] names = new String[16];
        // 调用添加姓名的方法
        addStudent(names);
        // 调用遍历数组方法
        printStudentName(names);
        // 调用随机学生姓名
        String name = randomStudentName(names);
        System.out.println(name);
    }

    /*
    * 定义方法，随机数做索引，数组中找到学生的姓名
    * */
    public static String randomStudentName(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        return names[index];
    }

    /*
    * 定义方法，遍历数组
    * */
    public static void printStudentName(String[] names){
        for(int i = 0 ; i < names.length ;i++){
            System.out.println(names[i]);
        }
    }

    /*
    * 定义方法，实现向数组中添加学生姓名
    * */
    public static void addStudent(String[] names) {
        names[0] = "秦始皇";
        names[1] = "汉高祖";
        names[2] = "汉元帝";
        names[3] = "魏武帝";
        names[4] = "司马懿";
        names[5] = "拓跋圭";
        names[6] = "唐太宗";
        names[7] = "宋太祖";
        names[8] = "明高祖";
        names[9] = "努尔哈赤";
        names[10] = "袁世凯";
        names[11] = "孙中山";
        names[12] = "蒋介石";
        names[13] = "毛爷爷";
        names[14] = "华盛顿";
        names[15] = "卑斯麦";
    }


    public void shopping(){
        /*
        * 实现商品的库存管理
        * 功能：
        * 1 展示用户选择功能清单
        * 2 根据选择的功能编号，进行不同的操作
        *   A 展示所有库存 B 修改库存数量
        *
        * */
        String[] brand = {"MacBookAir","ThinkpadT450"};
        double[] size = {13.3,15.6};
        double[] price = {9998.97,6789.56};
        int[] count = {0,0};
        while(true){
            int choose = chooseFunction();
            switch(choose){
                case 1:
                    // 调用查看库存清单方法
                    printStore(brand,size,price,count);
                    break;

                case 2:
                    // 调用修改库存的方法
                    update(brand,count);
                    break;

                case 3:
                    return ;


                default:
                    System.out.println("没有这个功能");
                    break;
            }
        }

    }

    /*
    * 定义方法 修改所有商品的库存
    * */
    public static void update(String[] brand, int[] count){
        // 遍历数组，遍历到一个，修改一个
        // 接受键盘输入
        Scanner sc = new Scanner(System.in);
        // 便利数组
        for(int i = 0; i < brand.length ; i++){
            System.out.println("请输入"+brand[i]+"的库存数");
            // 键盘输入，录入库存，存储到库存的数组中
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
        //int chooseNumber = sc.nextInt();
    }

    /*
    *
    * */
    public static void printStore(String[] brand,double[] size,double[] price,int[] count){
        System.out.println("----------商场库存清单----------");
        System.out.println("品牌型号     尺寸    价格    库存数");
        // 定义变量 计算总库存数和总价格
        int totalCount = 0;
        int totalMoney = 0;
        // 遍历数组，将数组中的所有信息都打印出来
        for(int i = 0 ; i < brand.length ; i++){
            System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
            totalCount += count[i];
            totalMoney += count[i]*price[i];
        }
        System.out.println("总库存数: "+totalCount);
        System.out.println("商品库存总金额: "+totalMoney);
    }

    /*
    * 定义方法 实现用户的选择功能
    * */
    public static int chooseFunction(){
        System.out.println("-------------库存管理------------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号");
        // 接受键盘输入
        Scanner sc = new Scanner(System.in);
        int chooseNumber = sc.nextInt();
        return chooseNumber;
    }

}
