package org.jake.write.array;

/**
 * The type Self array.
 */
public class SelfArray {
    //数组集合 用于存放数据
    private int[] array;
    //当前数组的大小
    private int size;

    /**
     * 构造函数 初始化array
     *
     * @param capacity 初始化大小
     */
    public SelfArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }


    /**
     * 插入一条数据
     *
     * @param index   插入的位置
     * @param element 插入的元素
     */
    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        //如果size 大于等于数组的长度了 先进行扩容
        if (size >= array.length) {
            resize();
        }
        //从右到左循环，每个元素向右移动
        for (int i = size - 1; i > index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        //size 增加一位
        size++;
    }

    /**
     * 删除元素
     *
     * @param index 删除元素的坐标
     * @return 删除的元素
     */
    public int delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        //获取删除的元素
        int deletedElement = array[index];
        //从左到右 以此左移一位
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    /**
     * Output.
     */
    public void output(){
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * 扩容 扩容的大小为当前容器的两倍
     */
    private void resize() {
        int[] newArr = new int[array.length * 2];
        System.arraycopy(array, 0, newArr, 0, array.length);
        array = newArr;
    }
}
