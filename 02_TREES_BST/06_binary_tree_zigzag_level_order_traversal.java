class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean rev = false;
        while(!deque.isEmpty()){
            int levelsize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for(int i = 0; i < levelsize ; i++){
                if(rev == false){
                    TreeNode currentNode = deque.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left != null){
                        deque.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        deque.addLast(currentNode.right);
                    }
                    
                }else{
                    TreeNode currentNode = deque.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right != null){
                        deque.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        deque.addFirst(currentNode.left);
                    }
                }
                
            }
            rev = !rev;
            result.add(currentLevel);
        }
        return result;
    }
}
