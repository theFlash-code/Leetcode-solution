class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] grid = new int[n][n];
        int[] artSize = new int[artifacts.length];
        for(int k=0; k<artifacts.length; ++k){
            int[] art = artifacts[k];
            int i=art[0], j=art[1];
            for(; i<=art[2]; ++i){
                j=art[1];
                for(; j<=art[3]; ++j){
                    grid[i][j] = k+1;
                    artSize[k]++;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<dig.length; ++i){
            int artIndex = grid[dig[i][0]][dig[i][1]]-1;
            if(artIndex != -1){
                artSize[artIndex]--;
                if(artSize[artIndex] == 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}