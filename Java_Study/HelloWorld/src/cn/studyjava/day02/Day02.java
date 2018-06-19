package cn.studyjava.day02;

public class Day02 {
    public void day02_main(String[] args){

        dataConvert_0();
        dataConvert_1();

        operator_0();
        operator_1();
        operator_2();
        operator_3();
        operator_4();
        operator_5();

        variable_0();
        variable_1();
        variable_2();

        shopping();
    }


    public void dataConvert_0(){
        /*
        * 数据类型的转换
        * 自动：取值范围小的类型，自动转换成取值范围大的类型
        * 一个类型 boolean 不参与类型转换
        * */

        // 定义double类型的变量
        double d = 1000; // 出现类型自动转换，int自动转成double
        System.out.println("自动类型转换： "+d);

        int i = 100;
        double d2 = i; // 出现类型自动转换，int自动转成double
        System.out.println("自动类型转换： "+d2);

        byte b = 10;
        int j = b; // 自动类型转换，byte自动转成int
        System.out.println("自动类型转换： "+j);
    }


    public void dataConvert_1(){
        /*
        * 数据类型的强制转行
        * 强制：数据类型取值范围大的，转成取值范围小的
        *
        * 数据类型的强制转行的公式：
        *   被转型后的数据类型 变量名 = (被转型后的数据类型)要被转的数据
        *
        *   强制类型转行，没有要求的时候不需要去做转行
        * */

        // double浮点转整数int
        double data = 3.14;

        // 被转型后的数据类型 变量名 = (被转型后的数据类型)要被转的数据
        int i_Data = (int)data;
        System.out.println("自动类型转换： "+i_Data);

        byte b = (byte)210;
        System.out.println("自动类型转换： "+b);
    }

    public void operator_0(){
        /*
        * 算数运算符
        * + 加法，连接
        * - 减法
        * * 乘法
        * / 除法
        * % 取模，获取余数
        * ++ 自增1
        * -- 自减1
        * */

        // + 连接作用，将一个字符串和其他数据相连
        // + 遇到字符串，变成连接符号"5+5=55"
        // + 任何类型只要和字符串+，所有的数据都变成了字符串
        System.out.println("5+5="+5+5);

        //除法运算
        int i = 100;
        int j = 9;
        System.out.println(i/j);

        //取模运算 两个数相除 获取的是余数
        int k = 6;
        int m = 4;
        System.out.println(k%m);

        //自增运算 ++
        int a = 3;
        int b = 4;

        a++; // 变量a自增加1
        System.out.println(a);

        ++b;
        System.out.println(b);
    }

    public void operator_1(){
        /*
        * ++符号写在前面和后面，在变量自己计算时，没有区别
        * 但是变量参与了其他计算就有区别了，如赋值运算
        *
        * j=i++ ++后算，变量i赋值给j后，再i++自增1
        * n=++m ++先算，变量m++自增1后再赋值给n
        * */
        int i = 5;
        int j = i++;
        System.out.println(i); //6
        System.out.println(j); //5

        int m = 5;
        int n = ++m;
        System.out.println(m);
        System.out.println(n);
    }

    public void operator_2(){
        // = 直接赋值，将右边的值赋值给左边的变量
        int i = 3;
        i = i + 3;
        System.out.println(i);
        System.out.println(i);

        // += 赋值运算符 i+=3 i=i+3
        int j = 5;
        j+=6; // j=j+6
        System.out.println(j);

        byte b = 1;
        b = (byte)(b + 1);
        System.out.println(b);

        byte b1=1;
        b1+=1; // 等同(byte)(b1 + 1);
        System.out.println(b1);

    }

    public void operator_3(){
        /*
        * 比较运算符，计算结果只有两个，真和假，true和false
        * 运算结果的数据类型是boolean类型
        *
        * == 比较符号两边的数据
        * ！= 比较符号两边的数据
        * > 比较符号两边的数据  1<2  true  2<2 false
        * < 比较符号两边的数据
        * >= 比较符号两边的数据 1>=2 false  2>=2 true
        * <= 比较符号两边的数据
        * */
        int i = 3;
        int j = 4;
        System.out.println(i=j);
        System.out.println(i==j);

        System.out.println(2==1);
        System.out.println(2!=1);
    }

    public void operator_4(){
        /*
        * 逻辑运算符，对两个boolean类型数据进行计算
        * 其结果也是boolean类型
        *
        * & 一边值是false，运算结果就是false
        * | 一边值是true，运算结果就是true
        * ^ 两边相同时为false，不同时为true
        * ! 取反
        * && 短路与，一边是false，另一边不运行
        * || 短路或，一边是true，另一边不运行
        * */

        System.out.println( false & true );
        System.out.println( true | true );
        System.out.println( false ^ false );//F
        System.out.println( true ^ false );//T
        System.out.println( true ^ true );//F


        System.out.println( !true );
        System.out.println( "--------------------------" );
        int i = 3;
        int j = 4;
        System.out.println(3>4 && ++j>2);
        System.out.println(i);
        System.out.println(j);

        System.out.println(3==3 || ++j>2);
        System.out.println(i);
        System.out.println(j);
    }

    public void operator_5(){
        /*
        * 三元运算符
        * 公式：布尔表达式 ？ 结果1 ： 结果2
        * 布尔表达式结果为true时，三元运算符的结果就是结果1
        * 布尔表达式结果为false时，三元运算符的结果就是结果2
        * */

        System.out.println(3>5?99:88);

        String s = 0==1?"哈哈":"呵呵";
        System.out.println(s);


        int a = 5;
        int b = 3;
        int c = 1;
        //         T  && T
        int n2 = (a>b && b>c) ? (c++) : (++c);
        System.out.println(c);
        System.out.println(n2);
    }

    public void variable_0(){
        /*
        * 定义Java中的变量
        * 定义所有数据类型的变量
        * 四类八种
        * */

        // 定义整数类型 字节类型 byte类型
        // 内存中的1个字节 -128 127
        byte b = 100;
        System.out.println(b);

        // 定义整数类型 短整数 short类型
        // 内存中的2个字节 -32768 32767
        short s = 200;
        System.out.println(s);

        // 定义整数类型 整形 int类型
        // 内存中的4个字节 -2147483648 2147483647
        int i = 500006;
        System.out.println(i);

        // 定义整数类型 长整型 long类型
        // 内存中8个字节
        long l = 21474836407L;
        System.out.println(l);

        // 定义浮点数据 单精度 float
        // 内存中4个字节
        float f = 1.0F;
        System.out.println(f);

        // 定义浮点数据 双精度 double
        // 内存中8个字节
        double d = 2.2;
        System.out.println(d);

        // 定义字符类型 char
        // 内存中2个字节，必须单引号包裹，只能写1个字符
        char c = '帅';
        System.out.println(c);

        // 定义布尔类型，boolean
        // 内存中1个字节，数据值，true和false
        boolean bool = true;
        System.out.println(bool);

    }

    public void variable_1(){
        /*
        * 常量：双引号包裹的字符串，以及其他数据类型
        * */
        String s = "Do You Love Me?";
        System.out.println(s);
    }

    public void variable_2(){
        /*
        * 变量定义和使用的注意事项
        * 1 变量定义后，不赋值，不能使用
        * 2 变量是有自己的作用范围，变量的有效范围，定义的一对大括号内
        * 3 变量不允许重复定义
        * */
        int i = 5;
        System.out.println(i);
        {
            int j = 10;
            System.out.println(j);
        }
    }

    public void shopping(){
        /*
        * 实现商品库存清单案例
        * 步骤：
        * 1 实现表头 是固定数据 直接写输出语句
        * 2 表格中间 商品数据 采用变量形式 定义变量 找对数据类型 输出所有变量
        * 3 表格尾巴 一部分数据固定 另一部分商品数据需要计算
        * */
        System.out.println("----------商场库存清单----------");
        System.out.println("品牌型号    尺寸      价格      库存数");
        // 定义表格中的数据变量
        //品牌型号,String, 尺寸,价格 double  库存int
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        int    macCount = 5;

        String thinkBrand = "ThinkPadT450";
        double thinkSize = 14;
        double thinkPrice = 5999.99;
        int    thinkCount = 10;

        String asusBrand = "ASUS-FL5800";
        double asusSize = 15.6;
        double asusPrice = 4999.5;
        int    asusCount = 18;
        //商品信息变量进行打印，变量之间加入一定的字符串空格
        System.out.println(macBrand+"   "+macSize+"    "+macPrice+"   "+macCount);
        System.out.println(thinkBrand+" "+thinkSize+"    "+thinkPrice+"   "+thinkCount);
        System.out.println(asusBrand+"  "+asusSize+"    "+asusPrice+"    "+asusCount);

        //计算库存总数，所有商品库存数量求和
        int totalCount = macCount+thinkCount+asusCount;
        //计算所有商品库存的总金额，每个商品价格*库存数
        double totalMoney = macCount*macPrice + thinkCount*thinkPrice + asusCount*asusPrice;
        //Ê输出表格底部
        System.out.println("总库存数: "+totalCount);
        System.out.println("商品库存总金额: "+totalMoney);
    }

}
