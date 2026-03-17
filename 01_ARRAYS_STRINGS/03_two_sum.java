class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <= 1){
            return new int[]{};
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        
    }
}
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         for(int i = 0; i<nums.length;i++){
//             for( int j = i+1; j<nums.length;j++){
//                 if(target == nums[i] + nums[j] ){
//                 ans[0] = i;
//                 ans[1] = j ;
//             }
//             }
            
//         } return ans;
//     }
// }
