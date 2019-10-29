package org.jake.write.linked.list;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class SelfLinkedList {
    private Node head;
    private Node last;
    private int size;


    public void insert(int data, int index) throws Exception {
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("超出链表节点的范围");
        }
        Node insertedNode = new Node() {
        }
    }

}
