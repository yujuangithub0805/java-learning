package org.yujuan.write.tree;

import java.util.TreeMap;

/**
 * The interface Tree.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 11:09:42
 */
public interface Tree<E> {

    /**
     * Gets root data.
     *
     * @return the root data
     * @author yujuan
     * @time 2019 /09/26 11:09:42
     */
    E getRootData();

    /**
     * Gets height.
     *
     * @return the height
     * @author yujuan
     * @time 2019 /09/26 11:09:42
     */
    int getHeight();

    /**
     * Gets number of nodes.
     *
     * @return the number of nodes
     * @author yujuan
     * @time 2019 /09/26 11:09:42
     */
    int getNumberOfNodes();

    /**
     * Is empty boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 11:09:42
     */
    boolean isEmpty();

    /**
     * Clear.
     *
     * @author yujuan
     * @time 2019 /09/26 11:09:42
     */
    void clear();


}

