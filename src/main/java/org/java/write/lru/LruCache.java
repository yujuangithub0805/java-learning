package org.java.write.lru;

import java.util.HashMap;
import java.util.LinkedList;

public class LruCache<K, V> {
    private int currentCacheSize;
    private int cacheCapacity;
    private HashMap<K, CacheNode<K, V>> caches;
    private CacheNode<K, V> first;
    private CacheNode<K, V> last;

    public LruCache(int size) {
        currentCacheSize = 0;
        this.cacheCapacity = size;
        caches = new HashMap<K, CacheNode<K, V>>(size);
    }

    public void put(K k, V v) {
        CacheNode<K, V> node = caches.get(k);
        //等于null 则代表缓存里没有数据 需要进行缓存
        if (node == null) {
            //如果超出范围 超出需要移除最后一个
            if (caches.size() >= cacheCapacity) {
                caches.remove(last.key);
                removeLast();
            }
        }
        //构建cacheNode  新构建的节点 应该是
        node = new CacheNode<K, V>();
        node.key = k;
        node.value = v;
        moveToFirst(node);
        caches.put(k, node);
        currentCacheSize++;
    }

    public V get(K k) {
        CacheNode<K, V> node = caches.get(k);
        if (node == null) {
            return null;
        }
        //将当前node 移动到首位
        moveToFirst(node);
        return node.value;
    }

    public V remove(K k) {
        CacheNode<K, V> node = caches.get(k);
        if (node != null) {
            //获取当前删除节点的前置节点，如果不为空 把前置节点的下一节点 置为当前删除节点的下一节点  (链表重新链接)
            if (node.pre != null) {
                node.pre.next = node.next;
            }
            //获取当前删除节点的后置节点，如果不为空 把后置节点的前置节点 置位当前删除节点的上一节点(链表重新连接)
            if (node.next != null) {
                node.next.pre = node.pre;
            }
            //判断当前删除节点是否是首节点 是的话 首节点需要变更 需要变更为当前删除节点的下一节点
            if (node == first) {
                first = node.next;
            }
            //判断当前删除
            if (node == last) {
                last = node.pre;
            }
            currentCacheSize--;
        }
        return caches.remove(k).value;
    }

    public void clear() {
        first = null;
        last = null;
        currentCacheSize = 0;
        cacheCapacity = 0;
        caches.clear();
    }

    private void moveToFirst(CacheNode<K, V> node) {
        //判断当前节点是否是首节点 初始化的时候 first 是null
        if (first == node) {
            return;
        }
        //删除当前节点
        if (node.next != null) {
            node.next.pre = node.pre;
        }
        //自行想一下链表的结构
        if (node.pre != null) {
            node.pre.next = node.next;
        }
        //如果节点是尾节点，
        if (node == last) {
            last = last.pre;
        }
        //如果first 节点和last节点都是空的  代表是缓存的第一个数据 需要将该节点设置为首节点和尾节点
        if (first == null || last == null) {
            first = last = node;
            return;
        }
        node.next = first;
        first.pre = node;
        first = node;
        first.pre = null;
    }

    /**
     * 移除最后一个元素
     */
    private void removeLast() {
        //最后一个元素是否为空
        if (last != null) {
            last = last.pre;
            if (last == null) {
                first = null;
            } else {
                last.next = null;
            }
        }
        currentCacheSize--;
    }

    static class CacheNode<K, V> {
        CacheNode<K, V> pre;
        CacheNode<K, V> next;
        K key;
        V value;

        public CacheNode() {

        }
    }

}
