class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.computeIfAbsent(nums[i], x->new ArrayList<>()).add(i);
        }

        int count = 0;

        for(Map.Entry<Integer,  List<Integer>> entry: freq.entrySet()){
            List<Integer> idx = entry.getValue();
            if(idx.size() < 3){
                continue;
            }
            boolean isSpecial = true;
            for(int i = 0; i < idx.size()-2; i++){
                if(idx.get(i+1)-idx.get(i) != idx.get(i+2)-idx.get(i+1)){
                    isSpecial = false;
                    break;
                }
            }
            if(isSpecial){
                count++;
            }
        }

        return count;
    }
}