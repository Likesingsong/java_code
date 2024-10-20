package chapter03;

/*
 * 如何获取一个随机数
 * 
 * 1.使用Java提供的API: Math类的random()
 * random调用之后会返回一个[0.0, 1.0)之间的浮点数
 * 
 * 2.获取一个[0, 100]范围的随机整数
 * 3.获取一个[1, 100]范围的随机整数
 * 4.获取一个[a, b]范围的随机整数
 * (int)(Math.random() * (b - a + 1)) + a
 */
public class RadomTest {
    public static void main(String[] args) {
        double randomNum = Math.random();

        System.out.println("randomNum = " + randomNum);

        // 获取一个[0, 100]范围的随机整数
        int i1 = (int) (Math.random() * 101);
        System.out.println("i1 = " + i1);
        // 获取一个[1, 100]范围的随机整数
        int i2 = (int) (Math.random() * 100) + 1;
        System.out.println("i2 = " + i2);
    }
}
