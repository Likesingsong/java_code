// filepath: project01/src/collections/GenericTypeDemo.java
package collections;

import java.util.ArrayList;

public class GenericTypeExample {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        
        System.out.println(stringList.getClass() == integerList.getClass());
    }
}