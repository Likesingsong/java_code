// filepath: project01/src/collections/SimpleArrayListImplementation.java
package collections;

import java.util.Arrays;

public class SimpleArrayListImplementation<E> {
    private Object[] elements;
    private int size;

    public SimpleArrayListImplementation() {
        elements = new Object[10];
        size = 0;
    }

    public boolean add(E element) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}