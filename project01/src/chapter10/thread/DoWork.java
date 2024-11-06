package chapter10.thread;

public class DoWork implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            long milliSecond = System.currentTimeMillis();
            System.out.println("i=" + i + ", milliSecond=" + milliSecond);
        }
    }
    
}
