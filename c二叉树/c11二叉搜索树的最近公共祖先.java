package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

public class c11二叉搜索树的最近公共祖先 {
    /**
     * !给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     */
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        int min = Math.min(p,q);
        int max = Math.max(p, q);

        while (root != null) {
            if (root.val > max) {
                root = root.left;
            } else if (root.val < min) {
                root = root.right;
            } else {
                return root.val;
            }
        }

        return -1;
    }
}
