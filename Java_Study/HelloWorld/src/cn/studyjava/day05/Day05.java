package cn.studyjava.day05;

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

    }

    public void methodDemo_3(){

    }

    public void methodOverLoadDemo_0(){

    }

    public void methodOverLoadDemo_1(){

    }

    public void callName(){

    }

    public void shopping(){

    }


}
