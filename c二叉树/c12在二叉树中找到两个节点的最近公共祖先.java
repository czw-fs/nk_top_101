package org.example.c二叉树;

import com.sun.source.tree.Tree;
import org.example.zCommonClass.TreeNode;

import java.util.Optional;

public class c12在二叉树中找到两个节点的最近公共祖先 {

    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        return Optional.ofNullable(helper(root,o1,o2)).map(item -> item.val).orElse(-1);
    }

    public TreeNode helper(TreeNode root, int o1, int o2) {
        if (root == null || root.val == o1 || root.val == o2){
            return root;
        }
        TreeNode left = helper(root.left, o1, o2);
        TreeNode right = helper(root.right, o1, o2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

}
