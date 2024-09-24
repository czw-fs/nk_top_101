package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class c2二叉树的中序遍历 {

    public int[] inorderTraversal (TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

}
