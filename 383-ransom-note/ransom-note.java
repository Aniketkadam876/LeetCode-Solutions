class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter = new int[26];
        for(char ch : magazine.toCharArray()){
            letter[ch - 'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            letter[ch - 'a']--;
        }
        for(int i = 0; i < letter.length; i++){
            if(letter[i] < 0){
                return false;
            }
        }

        return true;
    }
}