在二叉树中，除叶节点外，其他所有节点都包含子节点和非空子树

**二叉树的常见术语**
- 根节点： 位于二叉树顶层的节点，没有父节点
- 叶节点： 没有子节点的节点，其两个指针均指向None
- 边：连接两个节点的线段，即节点引用(指针)
- 节点所在层：从顶至底递增，根节点所在层为1
- 节点的度：节点的子节点的数量。在二叉树中，度的取值范围是0，1，2
- 二叉树的高度：从根节点到最远节点所经过的边的数量
- 节点的深度：从根节点到该节点所经过的边的数量
- 节点的高度：从距离该节点最远的叶节点到该节点所经过的边的数量

> 请注意，我们通常将“高度”和“深度”定义为“经过的边的数量”，但有些题目或教材可能会将其定义为“经过的节点的数量”。在这种情况下，高度和深度都需要加 1 。


### 二叉树的基本操作
#### 初始化二叉树
首先初始化节点，然后构建引用（指针）。
首先，定义一个节点类 TreeNode ，包含三个属性：
- val ：节点的值
- left ：指向左子节点的指针
- right ：指向右子节点的指针
```java
public class TreeNode {

    public int val;
    public TreeNode left;   // 左孩子
    public TreeNode right;  // 右孩子

    public TreeNode(int val) {
        this.val = val;
    }
}
```
初始化一个二叉树
```java
// 初始化节点
TreeNode n1 = new TreeNode(1); // 根节点 root
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
```
### 插入和删除节点
```java
TreeNode P = new TreeNode(0);
// 在 n1 -> n2 中间插入节点 P
n1.left = P;
P.left = n2;
// 删除节点 P
n1.left = n2;
```
> 需要注意的是，插入节点可能会**改变二叉树的原有逻辑结构**，而删除节点通常意味着**删除该节点及其所有子树**。因此，在二叉树中，插入与删除通常是由一套操作配合完成的，以实现有实际意义的操作。