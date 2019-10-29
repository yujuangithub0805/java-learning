package org.jake.write.linked.list;

/**
 * The type Self linked list.
 */
public class SelfLinkedList {

    //头节点指针
    private Node head;
    //尾节点指针
    private Node last;
    //链表的实际长度
    private int size;


    /**
     * 插入元素
     *
     * @param data  插入的数据
     * @param index the index 插入的位置
     * @throws Exception the exception
     */
    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        Node insertedNode = new Node(data);
        if (size == 0) {
            //如果是空链表的话  收尾节点都是当前节点
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            //如果是插入头部 之前的头部节点成为新增节点的下一个节点，新增节点成为头部节点
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            //如果是尾部插入 之前的尾部节点的next节点 成为新增新增节点  新增节点成为尾节点
            last.next = insertedNode;
            last = insertedNode;
        } else {
            Node prevNode = get(index - 1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;
        }
        size++;
    }


    /**
     * 节点的删除
     *
     * @param index the index
     * @return the node
     */
    public Node remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        Node removedNode = null;
        if (index == 0) {
            //删除头结点
            removedNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾节点
            Node prevNode = get(index - 1);
            removedNode = prevNode.next;
            prevNode.next=null;
            last = prevNode;
        }else {
            //删除中间节点
            Node prevNode = get(index-1);
            Node nextNode = prevNode.next.next;
            removedNode = prevNode.next;
            prevNode.next= nextNode;
        }
        size--;
        return removedNode;
    }


    /**
     * Get node.
     *
     * @param index the index
     * @return the node
     */
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Output.
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
