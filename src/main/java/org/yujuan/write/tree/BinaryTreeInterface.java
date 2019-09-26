package org.yujuan.write.tree;

/**
 * The interface Binary tree interface.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 13:51:35
 */
public interface BinaryTreeInterface<E> extends Tree<E>, TreeIterator<E> {
    /**
     * Sets tree.
     *
     * @param rootData the root data
     * @author yujuan
     * @time 2019 /09/26 13:51:35
     */
    void setTree(E rootData);

    /**
     * Sets tree.
     *
     * @param rootData  the root data
     * @param leftTree  the left tree
     * @param rightTree the right tree
     * @author yujuan
     * @time 2019 /09/26 13:51:35
     */
    void setTree(E rootData, BinaryTreeInterface<E> leftTree, BinaryTreeInterface<E> rightTree);
}
