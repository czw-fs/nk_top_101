package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

public class c8判断是不是二叉搜索树 {
    int pre = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }

        boolean key = isValidBST(root.left);
        if (!key) {
            return false;
        }

        if (root.val < pre){
            return false;
        }

        pre = root.val;
        boolean right = isValidBST(root.right);
        return right;
    }
}
