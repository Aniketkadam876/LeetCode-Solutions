class Solution {
    public int countOverlap(int[][] img1, int[][] img2, int rowOff, int colOff){
        int n = img1.length;
        int overlap = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int i2 = i+rowOff;
                int j2 = j+colOff;
                if(i2 < 0 || i2 >= n || j2 < 0 || j2 >= n)
                    continue;

                if(img1[i][j] == 1 && img2[i2][j2] == 1){
                    overlap++;
                }
            }
        }
        return overlap;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0;
        for(int i = -n+1; i < n; i++){
            for(int j = -n+1; j < n; j++){
                int overlap = countOverlap(img1, img2, i, j);

                maxOverlap = Math.max(maxOverlap, overlap);
            }
        }

        return maxOverlap;
    }
}