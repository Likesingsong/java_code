package chapter05;

public class MyArrayList<E> {
    private Object[] objs = new Object[10];
    private int size = 0;

    public boolean add(E e) {
        if (size >= 10) {
            return false;
        }
        objs[size++] = e;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("数组越界");
        }
        return (E) objs[index];
    }

    public int size() {
        return this.size;
    }
}
