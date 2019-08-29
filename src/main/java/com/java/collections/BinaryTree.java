package com.java.collections;

public class BinaryTree {

    // 二叉树的根节点
    public TreeNode rootNode;
    // 记录搜索深度
    public int count;

    /**
     * 利用传入一个数组来建立二叉树
     */
    public BinaryTree(int[] data) {
        for (int i = 0; i < data.length; i++) {
            addNodeToTree(data[i]);
        }
    }

    /**
     * 将指定的值加入到二叉树中适当的节点
     */
    private void addNodeToTree(int value) {
        TreeNode currentNode = rootNode;
        // 建立树根
        if (rootNode == null) {
            rootNode = new TreeNode(value);
            return;
        }

        // 建立二叉树
        while (true) {
            // 新增的value比节点的value小，则在左子树
            if (value < currentNode.value) {
                if (currentNode.leftNode == null) {
                    currentNode.leftNode = new TreeNode(value);
                    return;
                } else {
                    currentNode = currentNode.leftNode;
                }
            } else { // 新增的value比节点的value大，在右子树
                if (currentNode.rightNode == null) {
                    currentNode.rightNode = new TreeNode(value);
                    return;
                } else {
                    currentNode = currentNode.rightNode;
                }
            }
        }
    }

    /**
     * 中序遍历(左子树 -树根- 右子树)
     */
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.leftNode);
            System.out.print("[" + node.value + "]");
            inOrder(node.rightNode);
        }
    }

    /**
     * 前序遍历(树根 -左子树- 右子树)
     */
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print("[" + node.value + "]");
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }
    }

    /**
     * 后序遍历(左子树 -右子树- 树根)
     */
    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.print("[" + node.value + "]");
        }
    }

    /**
     * 从二叉树中查找指定value
     */
    public boolean findTree(TreeNode node, int value) {
        if (node == null) {
            System.out.println("共搜索" + count + "次");
            return false;
        } else if (node.value == value) {
            System.out.println("共搜索" + count + "次");
            return true;
        } else if (value < node.value) {
            count++;
            return findTree(node.leftNode, value);
        } else {
            count++;
            return findTree(node.rightNode, value);
        }
    }

    /**
     * 利用中序遍历进行排序
     */
    public void sort() {
        this.inOrder(rootNode);
    }

    class TreeNode {
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int value) {
            this.value = value;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static void main(String[] args) {
        int[] content = { 50, 35, 27, 45, 40, 48, 78, 56, 90 };

        BinaryTree tree = new BinaryTree(content);
        System.out.println("前序遍历:");
        tree.preOrder(tree.rootNode);
        System.out.println("\n中序遍历:");
        tree.inOrder(tree.rootNode);
        System.out.println("\n后序遍历:");
        tree.postOrder(tree.rootNode);

        System.out.println("\n\n开始搜索:");
        boolean isFind = tree.findTree(tree.rootNode, 48);
        System.out.println("是否搜索到" + 48 + ":" + isFind);

        System.out.println("\n进行排序:");
        tree.sort();
    }
}