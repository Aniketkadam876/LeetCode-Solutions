class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = candies[0];
        for(int num : candies){
            maxCandies = Math.max(num, maxCandies);
        }

        for(int i = 0; i < candies.length; i++){
            if(extraCandies+candies[i] >= maxCandies){
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}