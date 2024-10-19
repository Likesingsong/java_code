package chapter02;

/*
 * 基本数据类型变量间的运算规则
 * 
 * 1.可以做运算的基本数据类型有7种，不包含boolean类型
 * 2.运算规则包括：自动类型转换和强制类型转换
 * 3.测试自动类型提升
 * 规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型
 * 说明： 容量的大或小，不是变量类型占用空间的大小，而是所能表示数据的范围大小
 * long(8字节) > float(4字节) but long(表示的范围) < float(表示的范围)
 * byte < short < int < long < float < double
 * 特别的：byte short char类型的变量之间做运算，结果为int类型
 */
@SuppressWarnings("unused")
public class VariableTest3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;

        byte b1 = 12;

        int i3 = b1 + i1;

        //byte b2 = b1 + i1; //Type mismatch: cannot convert from int to byte

        //特殊情况1
        byte b3 = 12;
        short s1 = 10;

        //short s2 = b3 + s1; //Type mismatch: cannot convert from int to short

        i3 = b3 + s1;

        byte b4 = 12;
        //byte b5 = b1 + b4; //Type mismatch: cannot convert from int to byte

        short s3 = 12;

        //short s4 = s1 + s3; //Type mismatch: cannot convert from int to short

        //特殊情况2: char
        char c1 = 'a';

        //char c2 = c1 + b3; //Type mismatch: cannot convert from int to char

        int i4 = c1 + b3;


        //练习1
        long l2 = 123L;
        long l3 = 123; //自动类型提升 int -> long
        //long l4 = 123123123123; //The literal 123123123123 of type int is out of range
        long l5 = 123123123123L; //此时的123123123123是用8字节存储的long类型数据

        //练习2
        float f2 = 12.3F;
        //float f3 = 12.3; //默认是double，不满足自动类型提升，编译不通过

        //练习3 
        //规定1：整型常量默认是int类型
        byte b5 = 10;
        int i5 = b5 + 1;
        //规定2：浮点型常量默认是double类型 
        double d1 = b5 + 12.3;

        //练习4: 说明为什么不允许变量名是数字开头的。为了'自洽'
        long l6 = 123L;
        //int 123L = 3; //The left-hand side of an assignment must be a variable
        
    }
}
