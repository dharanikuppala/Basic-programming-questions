class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums, 0, nums.length-1);
    }
    TreeNode BST(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end-start) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST(nums, start, mid-1);
        root.right = BST(nums, mid +1, end);
        return root;

    }
    
}
