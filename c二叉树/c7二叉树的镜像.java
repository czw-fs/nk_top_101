package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import javax.swing.event.TreeModelEvent;

public class c7二叉树的镜像 {
    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     */

    public TreeNode Mirror (TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = Mirror(root.left);
        TreeNode right = Mirror(root.right);

        root.left = right;
        root.right =left;
        return root;
    }
}
