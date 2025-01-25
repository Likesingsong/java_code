package chapter04.entity;
public class MyService {
    private final ExternalService externalService;

    public MyService() {
        this.externalService = new ExternalService(1);
    }

    public int performSomeOperation() {
        System.out.println("inner operation...");
        // 使用 externalService 进行一些操作
        return externalService.getData();
    }
    public void doSomething() {
        System.out.println("do something...");
    }
}
