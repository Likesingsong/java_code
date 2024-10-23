package head.objectrefrence;
import org.junit.Test;

/**
 * DogTest
 */
public class DogTest {
    @Test
    public void test0() {
        /*
         * 对象的声明，创建和赋值有3个步骤
         * 1.声明一个引用变量： Dog dog
         * 2.创建对象：new Dog()
         * 3.连接对象和引：=
         */
        Dog dog = new Dog();

        dog.name = "Fido";

        dog.bark();
    }

    @Test
    public void test1() {
        //创建Dog对象
        Dog dog1  = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //创建Dog数组
        Dog[] myDogs = new Dog[3];

        //加狗
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //通过数组引用存取Dog
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //每只Dog执行bark方法
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
    
}
