package chapter02.exer;

/*
 * 定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2，2.5，6，求他们的面积。
 */
public class FloatDoubleExer {
    public static void main(String[] args) {
        //定义圆周率
        double pi = 3.14;

        //定义3个圆的半径
        double redius1 = 1.2;
        double redius2 = 2.5;
        int redius3 = 6;

        //计算面积
        double area1 = pi * redius1 * redius1;
        double area2 = pi * redius2 * redius2;
        double area3 = pi * redius3 * redius3;

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);
        System.out.println("area3 = " + area3);
    }
}
