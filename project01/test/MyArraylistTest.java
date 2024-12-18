package test;

import org.junit.Test;

import chapter05.MyArrayList;

import static org.junit.Assert.*;

public class MyArraylistTest {

    @Test
    public void testAdd_HappyPath() {
        MyArrayList<String> list = new MyArrayList<>();
        assertTrue(list.add("Element 1"));
        assertTrue(list.add("Element 2"));
        assertEquals(2, list.size());
    }

    @Test
    public void testAdd_FullCapacity() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertFalse(list.add(10)); // should return false
        assertEquals(10, list.size());
    }

    @Test
    public void testGet_ValidIndex() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Element 1");
        assertEquals("Element 1", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_InvalidIndex_Negative() {
        MyArrayList<String> list = new MyArrayList<>();
        list.get(-1); // should throw an exception
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_InvalidIndex_TooLarge() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Element 1");
        list.get(1); // should throw an exception since index 1 is out of bounds
    }
}
