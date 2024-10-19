package chapter02;

/*
 * 整型和浮点型变量的使用
 */
@SuppressWarnings("unused")
public class VariableTest1 {
    public static void main(String[] args) {
        //1.整型变量的使用
        // byte \ short \ int \ long
        /*
         * byte  1字节  -128 ~ 127
         * short 2字节  -2^15 ~ 2^15-1
         * int   4字节  -2^31 ~ 2^31-1
         * long  8字节  -2^63 ~ 2^63-1
         */
        byte b1 = 12;

        byte b2 = 127;

        //byte b3 = 128; //Type mismatch: cannot convert from int to byte(超出了byte所能表示的范围)

        short s1 = 1234;

        int i1 =  123123123;

        //1.1 long类型变量的值需要有后缀，可以是'l'或'L'
        long l1 = 123123123L;

        //1.2 开发中，定义整型变量时，一般声明为int类型


        //2. 浮点型变量的使用
        /*
         * 单精度 float  4字节  -3.403E38 ~ 3.403E38 （float > long, 但是精度比较低)
         * 双精度 double 8字节  -1.798E308 ~ 1.798E308 (较常使用)
         */
        double d1 = 1.23;
        //2.1 float类型变量的值需要有后缀，可以是'f'或'F'
        float f1 = 1.23F;
        System.out.println("f1 = " + f1);
        //2.2 开发中，定义浮点型变量时，一般声明为double类型，因为精度更高

        //测试浮点型变量的精度
        //结论：通过测试可知，浮点型变量的精度不高。在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
        //测试1
        System.out.println(0.1 + 0.2); //0.30000000000000004 为什么不等于0.3？

        //测试2
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);

        System.out.println(ff2);

        System.out.println(ff1 == ff2); //true

    }
}
