package cn.studyjava.day04;

import java.util.Random;

public class Day04 {
    /*
    * Java的流程控制语句
    * */
    public void day04_main(String[] args){
        // 控制语句switch
        switchWeek_0();
        switchWeek_1();
        // 数组
        arrayDemo_0();
        arrayDemo_1();
        arrayDemo_2();
        arrayDemo_3();
        arrayDemo_4();
        arrayDemo_5();
        // 二维数组
        arrayArrayDemo_0();
        arrayArrayDemo_1();
        arrayArrayDemo_2();
        arrayArrayDemo_3();

        callName();
    }

    /*
    * 选择语句 switch语句
    * 编写格式：
    *  switch(表达式){
    *           case 常量1:
    *               要执行的语句;
    *               break;
    *           case 常量2:
    *               要执行的语句;
    *               break;
    *           case 常量3:
    *               要执行的语句;
    *               break;
    *           default:
    *               要执行的语句;
    *               break;
    *  }
    *  执行流程：表达式和case后面的常量进行比较
    *  和哪个case后面的常量相同，就执行哪个case后面的程序，遇到break，就全结束。
    *
    *  关键字：switch，case，default，break
    *
    *  如果等于1，则输出星期一，
    *  如果等于2，则输出星期二，
    *  如果等于3，则输出星期三，
    *  如果等于4，则输出星期四，
    *  如果等于5，则输出星期五，
    *  如果等于6，则输出星期六，
    *  如果等于7，则输出星期日，
    *
    *  switch语句中的表达式的数据类型是有要求的：
    *  JDK1.0-1.4,数据类型接受byte、short、int、char
    *  JDK1.5,数据类型接受byte、short、int、char、enum(枚举)
    *  JDK1.7,数据类型接受byte、short、int、char、enum(枚举)、String
    *
    * */
    public void switchWeek_0(){
        // 定义变量，保存星期几的整数
        int week = 13;
        // switch语句
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("星期不存在，输入错误");
                break;
        }

    }

    /*
    * switch特性：case 穿透性
    * 案例：星期1-5输出 工作日，星期6-7输出 休息日
    * case 1,case 2, case 3...case 5输出结果相同
    *
    * case 后面的常量，和switch中数据相同，没有break，一直向下穿透
    * case 后面没有break，程序就一直向下穿透
    * */
    public void switchWeek_1() {
        int week = 30;
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("找不到了吧");
                break;
        }
    }

    /**********************************************************************/
    /***************************   数组   *********************************/
    /**********************************************************************/

    /*
    * 定义数组容器
    *   定义数组容器，要素，强制数据类型的语言
    *   必须有数据类型，大小，就是存储数据的个数
    *   定义数组公式：
    *       数据类型[] 变量名 = new 数据类型[存储元素的个数]
    *
    *           数据类型：数组中存储元素的数据类型
    *           [] 表示数组的意思
    *           变量名 自定义标识符
    *
    *           new 创建容器关键字
    *           数据类型：数组中存储元素的数据类型
    *           [] 表示数组的意思
    *           元素个数，就是数组中，可以存储多少个元素、数据(恒长、定长)
    *
    *           数组是一个容器：存储到数组中的每个元素都有自己的自动编号
    *           自动编号，最小值是0，最大值是长度-1
    *
    * */
    public void arrayDemo_0() {
        // 定义数组，存储整数，长度为3
        // 数据类型[] 变量名 = new 数据类型[存储元素的个数]
        int[] arr = new int[3];
        System.out.println(arr);

        // 通过索引的方式，数组中的三个元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    /*
    * 数组的操作，使用索引，对数组中的元素赋值
    * */
    public void arrayDemo_1() {
        // 定义数组，存储int类型数组，长度为5
        int[] arr = new int[5];

        // 将索引1上的元素，赋值3
        arr[1] = 3;
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }

    public void arrayDemo_2() {
        // 定义数组，定义的同时，对元素进行赋值
        int[] arr = new int[]{1, 2, 4, 5, 7, 9};
        System.out.println(arr.length);
        System.out.println(arr[5]);

        System.out.println("==============================");
        // 定义数组，直接大括号赋值
        int[] arr2 = {0,2,4,6,8};
        System.out.println(arr2.length);
        System.out.println(arr2[1]);
    }

    /*
    * 遍历数组
    * */
    public void arrayDemo_3() {
        int[] arr = {2,1,3,5,7,0,4};

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    /*
    * 数组操作中常见的两个异常：数组的索引越界异常，空指针异常
    * */
    public void arrayDemo_4(){
        // 数组的索引越界异常
        //int[] arr = {5,2,1};
        // 数组中3个元素，索引0、1、2
        //System.out.println(arr[3]);

        // 空指针异常
        int[] arr2 = {1,5,8};
        System.out.println(arr2[2]);
        arr2 = null; // arr2不在保存数组的地址了
        //System.out.println(arr2[2]);
    }

    /*
    * 计算数组中的最大值
    * */
    public void arrayDemo_5(){
        //定义数组int类型
        int[] arr = {5,1,12,4,6,8,0,3};
        //定义变量，初始值为数组的索引为0的元素
        int max = arr[0];
        //遍历数组，获取所有的元素，和变量max比较
        for(int i = 1; i < arr.length ; i++){
            //变量max和数组中的每一个元素比较
            //如果max小于数组中的每一个元素 >变为<即可
            if( max < arr[i] ){
                // 较大的数组的元素，赋值给max
                max = arr[i];
            }
        }
        // 遍历完成，变量max，就是数组的最大值
        System.out.println(max);
    }

    /******************************************/
    /*******************二维数组****************/
    /******************************************/
    public void arrayArrayDemo_0(){
        int[][] arr = new int[3][4];
        System.out.println(arr);

        System.out.println(arr[1]);
        System.out.println(arr[2][3]);
    }

    /*
    * 二维数组的遍历
    * */
    public void arrayArrayDemo_1(){
        /*
        * 二维数组中定义三个一维数组，每个一维数组的长度没有限定
        * */
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {0}
        };

        //问题：打印7，是数组元素0
        System.out.println(arr[2][1]);
        //输出结果
        System.out.println(arr[3][0]);
    }

    public void arrayArrayDemo_2(){
        int[][] arr = { {1,2,3},{4,5},{6,7,8,9},{0} };
        // 外循环，遍历二维数组
        for(int i = 0 ; i < arr.length ;i++){
            // 内循环，遍历每个一维数组
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /*
    * 二维数组遍历求和
    * 第一小组销售额为{11,12}万元
    * 第二小组销售额为{21,22,23}万元
    * 第三小组销售额为{31,32,33,34}万元
    * */
    public void arrayArrayDemo_3(){
        int[][] arr = {  {11,12} , {21,22,23} ,{31,32,33,34} };
        // 定义变量，保持两个求和的值
        int sum = 0 ; //所有元素的求和
        int groupSum = 0 ; //每个一维数组的求和

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                // 将一维数组的元素求和
                groupSum += arr[i][j];
            }
            System.out.println("每小组总金额 "+groupSum);

            //将每个一维数组的总和再相加
            sum += groupSum;
            //每个唯一数组求和，清空
            groupSum = 0;
        }
        System.out.println("本公司总金额 "+sum);
    }

    public void callName(){
        String[] names = {"张三","李四","王五","赵六","燕子李","闷倒驴","解花语","苗人凤","花姑娘","苍老师","及时雨宋江","金角大王","司马懿","诸葛四郎","林黛玉","贾宝玉"};

        for (int i=0; i<names.length; i++){
            System.out.println("打印出每一个名字： "+names[i]);
        }
        System.out.println("=================");

        //随机出一个人名
        Random random = new Random();

        int index = random.nextInt(names.length); // 随机数
        System.out.println("随机抽出一个名字： "+names[index]);
    }


}
