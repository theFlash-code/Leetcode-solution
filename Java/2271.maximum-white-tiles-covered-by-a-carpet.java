class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        int res = 0, tail = 0, covered  = 0;
        Arrays.sort(tiles, (a,b)->{return a[0]-b[0];});
        for(int head=0; res<carpetLen && head<tiles.length;){
            if(head == tail || tiles[tail][0]+carpetLen>tiles[head][1]){
                covered += Math.min(carpetLen, tiles[head][1]-tiles[head][0]+1);
                res = Math.max(res, covered);
                ++head;
            }else{
                int partial = Math.max(0, tiles[tail][0]+carpetLen-tiles[head][0]);
                res = Math.max(res, covered+partial);
                covered -= tiles[tail][1]-tiles[tail][0]+1;
                ++tail;
            }
        }
        return res;
    }
}