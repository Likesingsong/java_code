package test;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import chapter04.entity.ExternalService;
import chapter04.entity.MyService;

public class MyServiceTest {
    @Mock
    private ExternalService externalService;

    @InjectMocks
    private MyService myService;

    @Test
    public void test0() {
        MyService mockMyService = Mockito.spy(MyService.class);
        // Mockito.doReturn(1).when(myService).performSomeOperation();
        Mockito.when(mockMyService.performSomeOperation()).thenReturn(1);
        int result = mockMyService.performSomeOperation();
        System.out.println("result = " + result);
    }

    @Test
    public void test1() {
        MockitoAnnotations.openMocks(this);
        Mockito.doReturn(1).when(externalService).getData();

        int result = myService.performSomeOperation();
        System.out.println("result = " + result);
    }

}
