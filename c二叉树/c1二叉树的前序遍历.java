package org.example.c二叉树;


import org.example.zCommonClass.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 二叉树
 */
public class c1二叉树的前序遍历 {

    public int[] preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res.stream().mapToInt(i -> i).toArray();
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left,res);//遍历左子树
        preorder(root.right,res);//遍历右子树
    }

}
