package chapter10.thread;

import java.util.concurrent.TimeUnit;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println("当前线程：" + Thread.currentThread().getName());
        
        //创建一个用户线程，一直运行
        Thread thread = new Thread(() ->{
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    System.out.println("当前线程：" + Thread.currentThread().getName());
                }catch (InterruptedException e) {

                }
            }
        });
        thread.start();
    }
}
