package chapter02;

/*
 * 变量的使用
 * 1. 变量的理解：内存中的一块存储区域，该区域的数据可以在同一类型范围内不断变化
 * 2. 变量的构成包含三要素：数据类型，变量名和存储的值
 * 3. Java中变量声明的格式： 数据类型 变量名 = 变量值
 * 4. Java中的变量按照数据类型来分类
 *      基本数据类型(8种)
 *          整型 byte short int long
 *          浮点型 float double
 *          字符型 char
 *          布尔型 boolean
 *      引用数据类型
 *          类(class)
 *          数组(array)
 *          接口(interface)
 *          枚举(enum)
 *          注解(annotation)
 *          记录(record)
 * 5. 定义变量时，变量名要遵循标识符命名的规则和规范
 * 6. 说明
 *      1. 变量都有其作用域，变量只在作用域内是有效的，离开作用域无效
 *      2. 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算。
 *      3. 同一个作用域内，不可以声明两个同名的变量
 *      4. 变量值在赋值时必须满足变量的数据类型，并且在数据类型的有效范围内变化
 */
@SuppressWarnings("unused")
public class VariableTest {
    public static void main(String[] args) {
        //定义变量的方式1
        char gender; //过程1：变量的声明

        gender = '男'; //过程2：变量的赋值

        gender = '女';

        //定义变量的方式2：声明与初始化合并
        int age = 10;

        System.out.println(gender);


        System.out.println(age);

        //由于number前没有声明类型，即当前number变量没有提前定义。所以编译不通过。
        //number = 10;

        byte b1 = 127;
        //b1 = 128; //超出了byte的范围

    }
    
    public static void main123(String[] args) {
        char gender = '女';
    }
}
