package cn.studyjava.day02;

public class Day02 {
    public void day02_main(String[] args){

        dataConvert();
    }


    public void dataConvert(){
        // double浮点转整数int
        double data = 3.14;

        // 被转型后的数据类型 变量名 = (被转型后的数据类型)要被转的数据
        int i_Data = (int)data;
        System.out.println(i_Data);

        byte b = (byte)210;
        System.out.println(b);

    }



}
