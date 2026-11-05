class Solution {
    public int minMoves(int[] nums) {
        int maxNum = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxNum = Math.max(nums[i], maxNum);
        }

        int ans = 0; 
        for(int i = 0; i < nums.length; i++){
            ans += maxNum - nums[i];
        }

        return ans;
    }
}