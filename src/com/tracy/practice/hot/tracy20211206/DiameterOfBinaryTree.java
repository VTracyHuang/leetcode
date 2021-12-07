package com.tracy.practice.hot.tracy20211206;

/**
 * created by huangyating
 *
 * @Date 2021/12/6
 */
public class DiameterOfBinaryTree {
    int maxd = 0;

    //深度优先算法
    public int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return -1;
        }
        return depth(root);
    }

    private int depth(TreeNode root) {
        int L = depth(root.left);
        int R = depth(root.right);
        maxd = Math.max(L+R+1,maxd);
        return Math.max(L,R) + 1;
    }

}
