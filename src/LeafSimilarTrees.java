import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList();
        List<Integer> leaves2 = new ArrayList();
        findLeafValue(root1,leaves1);
        findLeafValue(root2,leaves2);
        return leaves1.equals(leaves2);
    }
    public void findLeafValue(TreeNode root,List<Integer> leaf){
        if (root != null) {
            if (root.left == null && root.right == null) {
                leaf.add(root.val);
            }
            findLeafValue(root.left, leaf);
            findLeafValue(root.right, leaf);
        }
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
