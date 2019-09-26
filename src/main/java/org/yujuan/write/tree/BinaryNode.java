package org.yujuan.write.tree;

import java.io.Serializable;

public class BinaryNode<E> implements BinaryNodeInterface<E>, Serializable {

    private E data;

    private BinaryNode<E> left;

    private BinaryNode<E> right;

    public BinaryNode() {
        this(null);
    }

    public BinaryNode(E data) {
        this(data, null, null);
    }

    public BinaryNode(E data, BinaryNode<E> leftChild, BinaryNode<E> rightChild) {
        this.data = data;
        this.left = leftChild;
        this.right = rightChild;
    }

    @Override
    public E getData() {
        return this.data;
    }

    @Override
    public void setData(E newData) {
        this.data = newData;
    }

    @Override
    public BinaryNodeInterface<E> getLeftChild() {
        return this.left;
    }

    @Override
    public BinaryNodeInterface<E> getRightChild() {
        return this.right;
    }

    @Override
    public void setLeftChild(BinaryNodeInterface<E> leftChild) {
        this.left = (BinaryNode<E>) leftChild;
    }

    @Override
    public void setRightChild(BinaryNodeInterface<E> rightChild) {
        this.right = (BinaryNode<E>) rightChild;
    }

    @Override
    public boolean hasLeftChild() {
        return left != null;
    }

    @Override
    public boolean hasRightChild() {
        return right != null;
    }

    @Override
    public boolean isLeaf() {
        return left == null && right == null;
    }

    @Override
    public int getNumberOfNodes() {
        int leftNumber = 0;
        int rightNumber = 0;
        if (this.left != null) {
            leftNumber = this.left.getNumberOfNodes();
        }
        if (this.right != null) {
            rightNumber = this.right.getNumberOfNodes();
        }
        return 1 + rightNumber + leftNumber;
    }

    @Override
    public int getHeight() {
        return getHeight(this);
    }

    @Override
    public BinaryNodeInterface<E> copy() {
        return null;
    }
}
