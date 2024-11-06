package test;

import org.junit.Test;

import chapter10.thread.DoWork;

public class DoWorkTest {
    @Test
    public void test() {
        DoWork dw = new DoWork();
        Thread t = new Thread(dw);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
