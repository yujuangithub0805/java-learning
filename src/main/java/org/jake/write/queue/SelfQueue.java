package org.jake.write.queue;

public class SelfQueue {
    private int[] array;
    // 头指针
    private int front;
    //尾指针
    private int rear;

    public SelfQueue(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * 入队
     *
     * @param element 入队的元素
     */
    public void enQueue(int element) throws Exception {
        //循环队列
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满！");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /**
     * 出队
     */
    public int deQueue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已空！");
        }
        int deQueueElement = array[front];
        //循环队列
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    /**
     * 输出队列
     */
    public void output() {
        //循环队列
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }
}
