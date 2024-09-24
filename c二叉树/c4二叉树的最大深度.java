package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

public class c4二叉树的最大深度 {

    public int maxDepth (TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
