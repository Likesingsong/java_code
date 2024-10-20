package chapter03;

import java.util.Scanner;

/*
 * 如何从键盘获取不同类型(基本数据类型，String类型)的变量：使用Scanner类
 * 
 * 1.使用Scanner获取不同类型数据的步骤
 * 步骤1：导包 import java.util.Scanner
 * 步骤2：创建一个Scanner类的实例
 * 步骤3：调用Scanner类中的方法获取指定类型的变量
 * 步骤4：关闭资源
 * 
 * 2.案例：小明注册某网站，要求录入个人信息。如下：
 * 请输入你的网名，你的年龄，你的体重，你是否单身，你的性别等情况。
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你的网名");
        String name = sc.next();
        System.out.println("输入你的年龄");
        int age = sc.nextInt();
        System.out.println("输入你的体重");
        double weight = sc.nextDouble();
        System.out.println("输入你的性别(男/女)");
        char gender = sc.next().charAt(0); //java没有提供Scanner输入字符的方法
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);
        System.out.println("gender = " + gender);

        sc.close();
    }
}
