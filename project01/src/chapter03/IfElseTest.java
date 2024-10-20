package chapter03;

/**
 * IfElseTest
 * 分支结构1：if-else条件判断结构
 * 
 * 1.格式1：
 * if(条件表达式) {
 *     语句块;
 * }
 * 
 * 2.格式2：
 * if(条件表达式) {
 *     语句块1;
 * } else {
 *     语句块2;
 * }
 * 
 * 3.格式3：
 * if(条件表达式1) {
 *     语句块1;
 * } else if(条件表达式2) {
 *     语句块2;
 * } 
 * ...
 * else if(条件表达式n) {
 *     语句块n;
 * } else {
 *     语句块n+1;
 * }
 */
public class IfElseTest {
    public static void main(String[] args) {
        /*
         * 案例1:成年人心率的正常范围是每分钟60-100次。体检时，
         * 如果心率不在此范围内，则提示需要做进一步的检查。
         */

         int heartBeats = 89;
         if(heartBeats >= 60 && heartBeats <= 100) {
            System.out.println("心率正常");
         } else {
            System.out.println("进一步检查");
         }

         /*
          * 案例2：定义一个整数，判定是偶数还是奇数
          */
        int num = 13;
        if(num % 2 == 0) {
            System.out.println("num is odd");
        } else {
            System.out.println("num is even");
        }
    }
    
}