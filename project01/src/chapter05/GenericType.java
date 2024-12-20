package chapter05;

import java.util.ArrayList;

public class GenericType {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(strings.getClass() == integers.getClass());
    }
}
