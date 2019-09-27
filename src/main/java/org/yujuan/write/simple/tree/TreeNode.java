package org.yujuan.write.simple.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TreeNode<E> {
    E data;
    TreeNode<E> leftNode;
    TreeNode<E> rightNode;

    public TreeNode(E data) {
        this.data = data;
    }
}
