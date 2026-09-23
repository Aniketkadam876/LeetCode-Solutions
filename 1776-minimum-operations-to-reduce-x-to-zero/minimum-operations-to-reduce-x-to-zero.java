class Solution {
    public int minOperations(int[] nums, int x) {
        int target = 0;
        for(int num : nums) {
            target += num;
        }
        target -= x;

        if(target < 0){
            return -1;
        }

        int left = 0;
        int currSum = 0;
        int maxSubLength = Integer.MIN_VALUE;
        int n = nums.length;

        for(int right = 0; right < n; right++){
            currSum += nums[right];

            while (currSum > target) {
                currSum -= nums[left];
                left++;
            }

            if(currSum == target){
                maxSubLength = Math.max(maxSubLength, right - left + 1);
            }
        }

        return maxSubLength == Integer.MIN_VALUE ? -1 : n - maxSubLength;
    }
}