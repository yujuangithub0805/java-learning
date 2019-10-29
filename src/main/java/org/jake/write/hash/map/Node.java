package org.jake.write.hash.map;

import java.util.Map;

public class Node<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;
    private Node<K, V> nextNode; //下一节点

    public Node(K key, V value, Node<K, V> nextNode) {
        super();
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return this.value;
    }

    public Node<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K, V> nextNode) {
        this.nextNode = nextNode;
    }

    public void setKey(K key) {
        this.key = key;
    }

    //判断是否还有下一个节点
        /*private boolean hasNext() {
            return true;
        }*/

}


