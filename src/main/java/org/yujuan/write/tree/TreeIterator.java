package org.yujuan.write.tree;

/**
 * The interface Tree iterator.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 13:49:22
 */
public interface TreeIterator<E> {

    /**
     * Gets preorder iterator.
     *
     * @return the preorder iterator
     * @author yujuan
     * @time 2019 /09/26 13:49:22
     */
    Iterable<E> getPreorderIterator();

    /**
     * Gets postorder iterator.
     *
     * @return the postorder iterator
     * @author yujuan
     * @time 2019 /09/26 13:49:22
     */
    Iterable<E> getPostorderIterator();

    /**
     * Gets inorder iterator.
     *
     * @return the inorder iterator
     * @author yujuan
     * @time 2019 /09/26 13:49:22
     */
    Iterable<E> getInorderIterator();

    /**
     * Gets level order iterator.
     *
     * @return the level order iterator
     * @author yujuan
     * @time 2019 /09/26 13:49:22
     */
    Iterable<E> getLevelOrderIterator();

}


