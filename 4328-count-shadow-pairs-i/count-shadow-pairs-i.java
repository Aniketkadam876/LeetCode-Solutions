class Solution {
    public long shadowPairs(int[] nums) {
        int[] copy = nums;
        int n = nums.length;
        long cnt = 0;
        List<Integer> stack = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int low = 0;
            int high = stack.size()-1;
            int cntValid = stack.size();
            while(low <= high){
                int mid = low + (high - low)/2;
                if(copy[stack.get(mid)] >= copy[i]){
                    cntValid = mid;
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
            cnt += cntValid;
            while(!stack.isEmpty() && copy[stack.get(stack.size() - 1)]> copy[i]){
                stack.remove(stack.size()-1);
            }
            stack.add(i);
        }
        return cnt;
    }
}