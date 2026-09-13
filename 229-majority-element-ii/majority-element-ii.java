class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int th = n/3;

        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            } else if(nums[i] != nums[i-1]){
                if(cnt > th){
                    ans.add(nums[i-1]);
                }
                cnt = 1;
            }
        }
        if(cnt > th){
            ans.add(nums[n-1]);
        }
        return ans;
    }
}