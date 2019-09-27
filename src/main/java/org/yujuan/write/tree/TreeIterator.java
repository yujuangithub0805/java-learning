package org.yujuan.write.tree;

/**
 * The interface Tree iterator.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 18:00:21
 */
public interface TreeIterator<E> {

    /**
     * Gets pre order iterator.
     *
     * @return the pre order iterator
     * @author yujuan
     * @time 2019 /09/26 18:00:21
     */
    Iterable<E> getPreOrderIterator();

    /**
     * Gets post order iterator.
     *
     * @return the post order iterator
     * @author yujuan
     * @time 2019 /09/26 18:00:21
     */
    Iterable<E> getPostOrderIterator();

    /**
     * Gets in order iterator.
     *
     * @return the in order iterator
     * @author yujuan
     * @time 2019 /09/26 18:00:21
     */
    Iterable<E> getInOrderIterator();

    /**
     * Gets level order iterator.
     *
     * @return the level order iterator
     * @author yujuan
     * @time 2019 /09/26 18:00:21
     */
    Iterable<E> getLevelOrderIterator();

}


