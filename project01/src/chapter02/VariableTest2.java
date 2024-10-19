package chapter02;

/**
 * 字符类型和布尔类型的使用
 */
@SuppressWarnings("unused")
public class VariableTest2 {
    public static void main(String[] args) {
        //1.字符类型 char Java中的char类型使用unicode编码
        //表示形式1:使用一对单引号使用，内部只能有一个字符
        char c1 = 'a';

        char c2 = '男';

        char c3 = '9';

        char c4 = 'A';

        char c5 = '-';
        //编译不通过
        // char c6 = '';
        // char c7 = 'ab';

        //表示形式2: 直接使用Unicode值来表示字符型常量
        char c8 = '\u0023';

        System.out.println("c8 = " + c8);
        //表示形式3：使用转义字符
        char c9 = '\n'; //换行符
        char c10 = '\t'; //制表符
        System.out.println("Hello" + c9 + "World");
        System.out.println("Hello" + c10 + "World");

        //表示形式4：
        char c11 = 97;
        System.out.println("c11 = " + c11); //a

        char c12 = '1';
        char c13 = 1;

        //2.布尔类型：boolean
        //只有两个取值：true \ false
        boolean bo1 = true;
        boolean bo2 = false;

        //boolean bo3 = 0; //编译不通过
        //常用于流程控制语句。比如:条件判断、循环结构
        boolean isMarried = false;
        if(isMarried) {
            System.out.println("结婚了。");
        } else {
            System.out.println("没结婚。");
        }
        //一般不谈boolean类型占用的空间大小。但是，真正在内存中分配使用的是4个字节
    }
}
