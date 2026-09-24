class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2){
            return -1;
        }
        Arrays.sort(nums);

        return nums[1];
        // int max = nums[0];
        // int min = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     max = Math.max(max, nums[i]);
        //     min = Math.min(min, nums[i]);
        // }

        // for(int i )
    }
}