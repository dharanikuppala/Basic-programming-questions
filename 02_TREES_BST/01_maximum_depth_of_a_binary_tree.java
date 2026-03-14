class Solution {
    int height = 0;
    public int maxDepth(TreeNode root) {
        height(root);
        return height;
    }
    int height(TreeNode node){
        if(node == null){
            return 0;
        }
        height =  Math.max(height(node.left), height(node.right)) +1;
        return height;
    }
}
