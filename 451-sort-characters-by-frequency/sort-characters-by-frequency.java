class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        List<Character> sortedChars = new ArrayList<>(freq.keySet());
        Collections.sort(sortedChars, (a,b)-> freq.get(b) - freq.get(a));

        StringBuilder result = new StringBuilder();
        for(char c: sortedChars) {
            result.append(String.valueOf(c).repeat(freq.get(c)));
        }

        return result.toString();
    }
}