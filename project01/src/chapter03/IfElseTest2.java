package chapter03;

/*
 * if-else的嵌套使用
 * 案例：由键盘输入三个整数分别存入变量num1,num2,num3，对它们进行排序(使用if-else)，并且从大到小排序
 */
public class IfElseTest2 {
    public static void main(String[] args) {
        int num1 = 33;
        int num2 = 22;
        int num3 = 11;

        if(num1 >= num2) {
            if(num3 >= num1) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else if(num3 <= num2) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
        } else {
            if(num3 <= num1) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else if(num3 >= num2) {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        }
    }
}
