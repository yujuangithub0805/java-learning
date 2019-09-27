package org.yujuan.write.tree;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Stack;

/**
 * The type Binary tree.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/27 11:34:27
 */
public class BinaryTree<E> implements BinaryTreeInterface<E>, Serializable {

    private BinaryNodeInterface<E> root;

    /**
     * Instantiates a new Binary tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Instantiates a new Binary tree.
     *
     * @param rootData the root data
     */
    public BinaryTree(E rootData) {
        this.root = (BinaryNode<E>) rootData;
    }

    /**
     * Instantiates a new Binary tree.
     *
     * @param rootData  the root data
     * @param leftTree  the left tree
     * @param rightTree the right tree
     */
    public BinaryTree(E rootData, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    }

    private void privateSetTree(E rootData, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        root = new BinaryNode<E>(rootData);
        if (leftTree != null && !leftTree.isEmpty()) {
            root.setLeftChild(leftTree.root);
        }
        if (rightTree != null && !rightTree.isEmpty()) {
            if (rightTree != leftTree) {
                root.setRightChild(rightTree.root);
            } else {
                root.setRightChild(rightTree.root.copy());
            }
        }
        if (leftTree != null && leftTree != this) {
            leftTree.clear();
        }
        if (rightTree != null && rightTree != this) {
            rightTree.clear();
        }
    }


    private class InorderIterator<E> implements Iterator<E> {
        private Stack<BinaryNodeInterface<E>> nodeStack;

        private BinaryNodeInterface<E> currentNode;

        /**
         * Instantiates a new Inorder iterator.
         */
        public InorderIterator() {
            currentNode = (BinaryNodeInterface<E>) root;
        }

        @Override
        public boolean hasNext() {
            return currentNode.isLeaf();
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }


    @Override
    public void setTree(E rootData) {

    }

    @Override
    public void setTree(E rootData, BinaryTreeInterface<E> leftTree, BinaryTreeInterface<E> rightTree) {

    }

    @Override
    public E getRootData() {
        E rootData = null;
        if (root != null) {
            rootData = root.getData();
        }
        return rootData;
    }

    @Override
    public int getHeight() {
        return root.getHeight();
    }

    @Override
    public int getNumberOfNodes() {
        return root.getNumberOfNodes();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
    }


    @Override
    public Iterable<E> getPreOrderIterator() {
        return null;
    }

    @Override
    public Iterable<E> getPostOrderIterator() {
        return null;
    }

    @Override
    public Iterable<E> getInOrderIterator() {
        return null;
    }

    @Override
    public Iterable<E> getLevelOrderIterator() {
        return null;
    }
}
