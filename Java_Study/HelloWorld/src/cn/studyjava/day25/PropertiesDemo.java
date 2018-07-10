package cn.studyjava.day25;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    /*
    *
    * */
    public void propertiesDemo_main(String[] args) throws IOException {
        function_2();
    }

    /*
    * Properties集合特有的方法store
    * store(OutputStream out)
    * store(Write w)
    * 接收所有的字节或者字符的输出流，将集合中的键值对，写回文件中保存
    * */
    public static void function_2() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "zhangsan");
        properties.setProperty("age", "31");
        properties.setProperty("email", "1232441");

        FileWriter fileWriter = new FileWriter("");
        properties.store(fileWriter, "");
        fileWriter.close();
    }

    /*
    * Properties集合特有的方法 load
    * load(InputStream in)
    * load(Reader r)
    * 传递任意的字节或者字符输入流
    * 流对象读取文件中的键值对，保存到集合
    * */
    public static void function_1() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("文件夹路径/pro.properties");
        // 调用集合的方法load，传递字符输入流
        properties.load(fileReader);

        fileReader.close();
        System.out.println(properties);
    }

    /*
    * 使用Properties集合，存储键值对
    * setProperty等同于Map接口中put
    * setProperty(String key, String value)
    * 通过键值对，setProperty(String key)
    * */
    public static void function_0(){
        Properties properties = new Properties();
        properties.setProperty("a", "1");
        properties.setProperty("b", "2");
        properties.setProperty("c", "3");

        System.out.println(properties);

        String value = properties.getProperty("c");
        System.out.println(value);

        // 方法stringPropertyNames，将集合中的键存储到Set集合，类似于keySet
        Set<String> set = properties.stringPropertyNames();
        for (String key:
             set) {
            System.out.println(key+" ... "+properties.getProperty(key));
        }

    }


}
