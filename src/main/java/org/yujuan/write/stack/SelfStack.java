package org.yujuan.write.stack;

import java.util.Arrays;

public class SelfStack<E> implements Stack<E> {

    private int DEFAULT_SIZE = 16;
    private int capacity;

    private int size;

    private Object[] elementData;

    public SelfStack() {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public SelfStack(int initSize) {
        capacity = 1;
        //capacity 设置为initSize 的最小二次方
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
    public E pop() {
        if (empty()) {
            throw new IndexOutOfBoundsException();
        }
        E oldValue = (E) elementData[size - 1];
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public void push(E element) {
        ensureCapacity(size + 1);
        elementData[size++] = element;
    }


    /**
     * 扩容
     *
     * @param minCapacity
     */
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            while (capacity < minCapacity) {
                capacity <<= 1;
            }
        }
        elementData = Arrays.copyOf(elementData, capacity);
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) elementData[size - 1];
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
}
