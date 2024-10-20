package chapter02;

/*
 * 测试强制类型转换 
 * 规则
 * 1.如果需要将容量大的变量的类型转换为容量i西奥德变量的类型，需要使用强制类型转换
 * 2.强制类型转换需要使用强转符：()。在()内知名要转换为的数据类型。
 * 3.强制类型转换类型过程中可能导致精度损失
 */
@SuppressWarnings("unused")
public class VariableTest4 {
    public static void main(String[] args) {
        double d1 = 12;

        // int i1 = d1; //Type mismatch: cannot convert from double to int

        int i1 = (int) d1;

        System.out.println(i1);

        long l1 = 123;

        // short s1 = l1; //Type mismatch: cannot convert from long to short
        short s1 = (short) l1;
        System.out.println(s1);

        //练习
        int i2 = 12;
        float f1 = i2; //自动类型提升
        System.out.println(f1);

        float f2 = (float)i2; //编译可以通过，但是可以省略()

        //精度损失例子1
        double d2 = 12.3;
        int i3 = (int)d2; //截断小数点后面的内容
        System.out.println(i3);

        //精度损失例子2
        int i4 = 128;
        byte b1 = (byte)i4;
        System.out.println(b1); //-128

        //实际开发举例
        byte b2 = 12;
        method(b2);

        long l2 = 12;
        //method(l2); //The method method(int) in the type VariableTest4 is not applicable for the arguments (long)
        method((int)l2);
    }

    private static void method(int number) { // int number = b2 自动类型提升
        System.out.println("number = " + number);
    }

}
