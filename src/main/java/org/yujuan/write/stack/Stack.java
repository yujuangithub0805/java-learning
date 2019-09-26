package org.yujuan.write.stack;

/**
 * The interface Stack.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/26 10:09:37
 */
public interface Stack<E> {

    /**
     * Length int.
     *
     * @return the int
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    int length();

    /**
     * Pop e.
     *
     * @return the e
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    E pop();

    /**
     * Push.
     *
     * @param element the element
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    void push(E element);

    /**
     * Peek e.
     *
     * @return the e
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    E peek();

    /**
     * Empty boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    boolean empty();

    /**
     * Clear.
     *
     * @author yujuan
     * @time 2019 /09/26 10:09:37
     */
    void clear();
}
