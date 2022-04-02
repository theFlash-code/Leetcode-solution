class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] sdr = new int[mat.length]; 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{return sdr[a]==sdr[b] ? a-b : sdr[a]-sdr[b] ;});
        int j=0;
        for(int[] m: mat){
            int i=0, cnt=0;
            while(i < m.length && m[i] == 1){
                cnt++;
                i++;
            }
            sdr[j] = cnt;
            pq.add(j);
            j++;
        }
        int[] res = new int[k];
        for(int i=0; i<k; ++i){
            res[i] = pq.poll();
        }
        return res;
    }
}