package org.yujuan.write.simple.tree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * The type Binary tree.
 *
 * @param <E> the type parameter
 * @author yujuan
 * @time 2019 /09/27 14:11:52
 */
public class BinaryTree<E> {

    private TreeNode<E> root;

    /**
     * Instantiates a new Binary tree.
     */
    public BinaryTree() {
        this.root = new TreeNode<E>();
    }

    /**
     * Instantiates a new Binary tree.
     *
     * @param data the data
     */
    public BinaryTree(E data) {
        this.root = new TreeNode<>(data);
    }

    /**
     * Add node tree node.
     *
     * @param parent the parent
     * @param data   the data
     * @param isLeft the is left
     * @return the tree node
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public TreeNode<E> addNode(TreeNode<E> parent, E data, boolean isLeft) {
        if (parent == null) {
            throw new RuntimeException("父节点为空");
        }
        if (isLeft && parent.leftNode != null) {
            throw new RuntimeException("左节点已经存在");
        }
        if (!isLeft && parent.rightNode != null) {
            throw new RuntimeException("右节点已经存在");
        }

        TreeNode<E> treeNode = new TreeNode<>(data);
        if (isLeft) {
            parent.leftNode = treeNode;
        } else {
            parent.rightNode = treeNode;
        }
        return treeNode;
    }

    /**
     * Empty boolean.
     *
     * @return the boolean
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public boolean empty() {
        return root.data == null;
    }

    /**
     * Root tree node.
     *
     * @return the tree node
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public TreeNode<E> root() {
        if (empty()) {
            throw new RuntimeException("当前树是个空数");
        }
        return root;
    }

    /**
     * Parent e.
     *
     * @param node the node
     * @return the e
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public E parent(TreeNode node) {
        return null;
    }

    /**
     * Left child e.
     *
     * @param parent the parent
     * @return the e
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public E leftChild(TreeNode<E> parent) {
        if (parent == null) {
            throw new RuntimeException("空节点不能访问左子树");
        }
        return parent.leftNode == null ? null : parent.leftNode.data;
    }

    /**
     * Right child e.
     *
     * @param parent the parent
     * @return the e
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public E rightChild(TreeNode<E> parent) {
        if (parent == null) {
            throw new RuntimeException("空节点不能访问右子树");
        }
        return parent.rightNode == null ? null : parent.rightNode.data;
    }

    /**
     * Deep int.
     *
     * @return the int
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public int deep() {
        return deep(root);
    }

    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.leftNode == null && node.rightNode == null) {
            return 1;
        } else {
            int leftDeep = deep(node.leftNode);
            int rightDeep = deep(node.rightNode);
            return 1 + Math.max(leftDeep, rightDeep);
        }
    }

    /**
     * Pre traverse list.
     *
     * @return the list
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public List<TreeNode> preTraverse() {
        return preOrderTraverse(root);
    }

    private List<TreeNode> preOrderTraverse(TreeNode<E> node) {
        List<TreeNode> list = new ArrayList<>();
        list.add(node);
        if (node.leftNode != null) {
            list.addAll(preOrderTraverse(node.leftNode));
        }
        if (node.rightNode != null) {
            list.addAll(preOrderTraverse(node.rightNode));
        }
        return list;
    }

    /**
     * In traverse list.
     *
     * @return the list
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public List<TreeNode> inTraverse() {
        return inOrderTraverse(root);
    }

    private List<TreeNode> inOrderTraverse(TreeNode<E> node) {
        List<TreeNode> list = new ArrayList<>();
        if (node.leftNode != null) {
            list.addAll(inOrderTraverse(node.leftNode));
        }
        list.add(node);
        if (node.rightNode != null) {
            list.addAll(inOrderTraverse(node.rightNode));
        }
        return list;
    }

    /**
     * Post traverse list.
     *
     * @return the list
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public List<TreeNode> postTraverse() {
        return postOrderTraverse(root);
    }

    private List<TreeNode> postOrderTraverse(TreeNode<E> node) {
        List<TreeNode> list = new ArrayList<>();
        if (node.leftNode != null) {
            list.addAll(postOrderTraverse(node.leftNode));
        }
        if (node.rightNode != null) {
            list.addAll(postOrderTraverse(node.rightNode));
        }
        list.add(node);
        return list;
    }

    /**
     * Level traverse list.
     *
     * @return the list
     * @author yujuan
     * @time 2019 /09/27 14:11:52
     */
    public List<TreeNode> levelTraverse() {
        return levelOrderTraverse(root);
    }

    private List<TreeNode> levelOrderTraverse(TreeNode<E> data) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<TreeNode> list = new ArrayList<>();
        if (data != null) {
            queue.offer(data);
        }
        while (!queue.isEmpty()) {
            list.add(queue.peek());
            TreeNode p = queue.poll();
            if (p.leftNode != null) {
                queue.offer(p.leftNode);
            }
            if (p.rightNode != null) {
                queue.offer(p.rightNode);
            }
        }
        return list;
    }

}
