package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.Optional;

public class c6合并二叉树 {

    /**
     * 已知两颗二叉树，将它们合并成一颗二叉树。
     * 合并规则是：都存在的结点，就将结点值加起来，否则空的位置就由另一个树的结点来代替
     */
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }

        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left,t2.left);
        root.right = mergeTrees(t1.right,t2.right);
        return root;
    }

}
