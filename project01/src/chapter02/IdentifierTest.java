package chapter02;

/**
 * IdentifierTest
 * 
 * 1.什么是标识符？
 * Java中变量、方法、类等要素命名时使用的字符序列，称为标识符。
 * 凡是自己可以起名字的地方都叫标识符。比如：类名，方法名，变量名，包名，常量名等
 * 
 * 2.标识符的命名规则(必须遵守!!! 否则编译不通过)
 * > 由26个英文字母大小写，0-9 _ 或 $ 组成。
 * > 数字不可以开头。
 * > 不可以使用关键字和保留字，但能包含关键字和保留字。
 * > Java中严格区分大小写，长度无限制。
 * > 标识符不能包含空格。
 * 
 * 3.标识符的命名规范(建议遵守)
 * 包名:多单词组成时所有字母都小写:xxxyyyzzz。
 * 例如:
 * java.lang、com.atguigu.bean
 * 类名、接口名:多单词组成时，所有单词的首字母大写:XxxYyyZzz
 * 例如:HelloWorld,String,System等
 * 变量名、
 * 方法名:多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写:xxxYyyZzz
 * 例如:age,name,bookName,main,binarySearch,getName
 * 常量名:所有字母都大写。多单词时每个单词用下划线连接:XXX_YYY_ZZZ
 * 例如:MAX VALUE,PI,DEFAULT CAPACITY
 */
@SuppressWarnings("unused")
public class IdentifierTest {
    public static void main(String[] args) {
        int abc = 12; //注意见名知意
        int age = 18; //age : 标识符
         
        char gender = '男';

        char c1 = '女';

        //不推荐写法 int myage = 12;
        int myAge = 12;

        System.out.println(myAge);

   } 
    
}

class _a$bc {
    
}