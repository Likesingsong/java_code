package tree;

public class binary_tree {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        // 初始化树结构
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        // 插入与删除节点
        // 1.在n1与n2之间插入一个节点n8
        TreeNode n8 = new TreeNode(8);
        n1.left = n8;
        n8.left = n2;
        // 2.删除节点n8
        n1.left = n2;

        
    }
}
