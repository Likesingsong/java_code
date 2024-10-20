package chapter02;

/*
 * 基本数据类型与String的运算
 * 一、关于String的理解
 * 1.String类型属于引用类型
 * 2.String类型的变量，可以使用一对""的方式进行赋值
 * 
 * 二、String 与基本数据类型间的运算
 * 1.这里的基本数据类型是包括boolean类型在内的8种类型
 * 2.String与基本数据类型之间只能作连接运算，使用"+"表示
 * 3.运算的结果是String类型
 */
@SuppressWarnings("unused")
public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello, World";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";
        String str3 = "a"; //char c1 = 'a';

        //测试连接运算
        int num1 = 12;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num1;
        System.out.println(str6);

        //String str7 = b1 + num1 + str4; //The operator + is undefined for the argument type(s) boolean, int

        //如何将String类型转换为基本数据类型
        String str8 = "abc"; //不能考虑转换为基本数据类型
        int num2 = 10;

        String str9 = num2 + ""; // "10"

        //int num3 = (int)str9; //Cannot cast from String to int

        //如何实现将数字的字符串转换为数值？
        int num3 = Integer.parseInt(str9);
        System.out.println(num3+1);

    }
}
