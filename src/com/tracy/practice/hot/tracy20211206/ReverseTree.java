package com.tracy.practice.hot.tracy20211206;

/**
 * created by huangyating
 *
 * @Date 2021/12/7
 */
public class ReverseTree {
    public static void main(String[] args) {

    }
    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode right = invertTree(root.left);
        TreeNode left = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
