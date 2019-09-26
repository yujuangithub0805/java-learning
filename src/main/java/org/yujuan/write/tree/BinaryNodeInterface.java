package org.yujuan.write.tree;

/**
 * The interface Binary node interface.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 13:56:19
 */
public interface BinaryNodeInterface<E> {
    /**
     * Gets data.
     *
     * @return the data
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    E getData();


    /**
     * Sets data.
     *
     * @param newData the new data
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    void setData(E newData);

    /**
     * Gets left child.
     *
     * @return the left child
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    BinaryNodeInterface<E> getLeftChild();

    /**
     * Gets right child.
     *
     * @return the right child
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    BinaryNodeInterface<E> getRightChild();

    /**
     * Sets left child.
     *
     * @param leftChild the left child
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    void setLeftChild(BinaryNodeInterface<E> leftChild);


    /**
     * Sets right child.
     *
     * @param rightChild the right child
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    void setRightChild(BinaryNodeInterface<E> rightChild);

    /**
     * Has left child boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    boolean hasLeftChild();


    /**
     * Has right child boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    boolean hasRightChild();

    /**
     * Is leaf boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    boolean isLeaf();

    /**
     * Gets number of nodes.
     *
     * @return the number of nodes
     * @author yujuan
     * @time 2019 /09/26 13:56:19
     */
    int getNumberOfNodes();


    /**
     * Gets height.
     *
     * @return the height
     * @author yujuan
     * @time 2019 /09/26 13:56:30
     */
    int getHeight();

    /**
     * Copy binary node interface.
     *
     * @return the binary node interface
     * @author yujuan
     * @time 2019 /09/26 13:56:30
     */
    BinaryNodeInterface<E> copy();
}
