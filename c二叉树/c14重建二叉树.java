package org.example.c二叉树;

import org.example.zCommonClass.TreeNode;

import java.util.HashMap;

public class c14重建二叉树 {

    /**
     * !给定节点数为 n 的二叉树的前序遍历和中序遍历结果，请重建出该二叉树并返回它的头结点。
     */

    // 哈希表存储中序遍历中元素的索引
    private HashMap<Integer, Integer> inOrderIndexMap = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] preOrder, int[] inOrder) {
        for (int i = 0; i < inOrder.length; i++) {
            inOrderIndexMap.put(inOrder[i], i);
        }

        return buildSubTree(preOrder, 0, 0, inOrder.length);
    }


    private TreeNode buildSubTree(int[] preOrder, int preRootIndex, int inOrderStart, int inOrderEnd) {
        if (inOrderStart >= inOrderEnd) {
            return null;
        }

        int rootValue = preOrder[preRootIndex];
        TreeNode root = new TreeNode(rootValue);
        //中序遍历中根节点所在索引
        int inRootIndex = inOrderIndexMap.get(rootValue);

        root.left = buildSubTree(preOrder, preRootIndex + 1, inOrderStart, inRootIndex);
        root.right = buildSubTree(preOrder, preRootIndex + (inRootIndex - inOrderStart) + 1, inRootIndex + 1, inOrderEnd);

        return root;
    }
}
