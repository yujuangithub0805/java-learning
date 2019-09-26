package org.yujuan.write.list;

/**
 * The interface List.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 10:43:39
 */
public interface List<E> {
    /**
     * Length int.
     *
     * @return the int
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    int length();

    /**
     * Get e.
     *
     * @param index the index
     * @return the e
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    E get(int index);

    /**
     * Empty boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    boolean empty();

    /**
     * Clear.
     *
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    void clear();

    /**
     * Delete e.
     *
     * @param index the index
     * @return the e
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    E delete(int index);

    /**
     * Remove e.
     *
     * @return the e
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    E remove();

    /**
     * Add.
     *
     * @param element the element
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    void add(E element);

    /**
     * Insert.
     *
     * @param element the element
     * @param index   the index
     * @author yujuan
     * @time 2019 /09/26 10:43:39
     */
    void insert(E element, int index);
}

