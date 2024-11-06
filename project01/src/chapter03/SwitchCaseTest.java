package chapter03;

/*
 * 分支结构之switch-case的使用
 * 
 * 1.语法格式
 * switch(表达式) {
 *     case 常量1:
 *         //执行语句1
 *         break;
 *     case 常量2:
 *         //执行语句2
 *         break;
 *     ...
 *     default:
 *         //默认执行语句
 *         break;
 * 2.执行过程
 * 根据表达式中的值，依次匹配case语句。一旦与某一个case中的常量相等，就会执行该分支。
 *     情况1：语句执行完之后有break语句，
 *     情况2：语句执行完之后无break语句
 * }
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("number is 1.");
                break; //结束当前的switch-case结构
        
            default:
                System.out.println("number is not 1.");
                break;
        }
    }
}
