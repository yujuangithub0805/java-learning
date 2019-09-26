package org.yujuan.write.list;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * The type Self list.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 10:59:36
 */
@SuppressWarnings("unchecked")
public class SelfList<E> implements List<E> {

    private final int DEFAULT_SIZE = 16;
    private Object[] elementData;
    private int capacity;
    private int size;

    /**
     * Instantiates a new Self list.
     */
    public SelfList() {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    /**
     * Instantiates a new Self list.
     *
     * @param initSize the init size
     */
    public SelfList(int initSize) {
        capacity = 1;
        while (capacity < initSize) {
            capacity <<= 1;
        }
        elementData = new Object[capacity];
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elementData[index];
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }

    @Override
    public E delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public E remove() {
        return delete(size - 1);
    }

    @Override
    public void add(E element) {
        insert(element, size);
    }

    @Override
    public void insert(E element, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            while (capacity < minCapacity) {
                capacity <<= 1;
            }
            elementData = Arrays.copyOf(elementData, capacity);
        }
    }

    /**
     * Locate int.
     *
     * @param element the element
     * @return the int
     * @author yujuan
     * @time 2019 /09/26 10:59:37
     */
    public int locate(E element) {
        for (int index = 0; index < size; index++) {
            if (elementData[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }
}
