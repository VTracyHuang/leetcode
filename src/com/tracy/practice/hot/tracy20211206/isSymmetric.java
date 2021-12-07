package com.tracy.practice.hot.tracy20211206;


/**
 * created by huangyating
 *  对称二叉树
 * @Date 2021/12/6
 */
public class isSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        } else {
            return helper(root.left, root.right);
        }
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == right) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && (helper(left.left, right.right)) && (helper(left.right, right.left));
    }
}
