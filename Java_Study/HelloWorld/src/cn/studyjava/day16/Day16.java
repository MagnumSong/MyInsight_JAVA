package cn.studyjava.day16;

public class Day16 {

    // 定义主方法
    public void day16_main(String[] args){
        // 常用API正则表达式 Regular Expression
        regularDemo0();
    }

    // 正则表达式
    public void regularDemo0(){
        // 检查手机号码是否合法
        // 1开头 可以是34578 0-9 位数固定11位
        String telNum = "15766689767";
        //
        boolean telNumBool = telNum.matches("1[34857][\\d]{11}]");

        System.out.println("是不是电话啊： "+telNumBool);

        /*
        * 检查QQ号码是否合法
        * 0不能开头，全数字，位数5-10位
        * 123456
        * \\d \\D匹配是不是数组
        * */
        String qqNum = "";
        // 检查QQ是不是合法
        boolean qqNumBool = qqNum.matches("");




    }






}
