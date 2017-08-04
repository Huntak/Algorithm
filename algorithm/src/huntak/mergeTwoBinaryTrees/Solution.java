package huntak.mergeTwoBinaryTrees;

public class Solution {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode tm;
        
        tm.val = t1.val + t2.val;
        
            
            if(t1.left.val == null)
                tm.left = t2.left.val;
            if(t2.left.val == null)
                tm.left = t1.left.val;
            if(t1.left.val != null && t2.left.val == null)
                tm.left = t1.left.val + t2.left.val;

            if(t1.right.val == null)
                tm.right = t2.right.val;
            if(t2.right.val == null)
                tm.right = t1.right.val;
            if(t1.right.val != null && t2.right.val == null)
                tm.right = t1.right.val + t2.right.val;
        
        return tm;
    }
}
