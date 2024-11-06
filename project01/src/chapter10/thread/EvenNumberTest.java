package chapter10.thread;

/**
 * EvenNumberTest
 * 创建一个分线程1，用于遍历100以内的偶数
 */
public class EvenNumberTest {

    
}

// ① 创建一个继承于Thread类的子类
class PrintNumber extends Thread {
    // ② 重写Thread类的run() ---> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        super.run();
        
    }

}
// ③ 创建当前Thread子类的对象
// ④ 通过对象调用start()方法