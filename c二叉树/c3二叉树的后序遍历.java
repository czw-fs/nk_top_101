package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class c3二叉树的后序遍历 {

    public int[] postorderTraversal (TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        inorder(root.left,res);
        inorder(root.right,res);
        res.add(root.val);
    }
}
