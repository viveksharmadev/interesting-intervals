// https://leetcode.com/problems/maximum-length-of-pair-chain/
class Solution {
    // tc -> nlogn, sc-> n
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> (a[1] - b[1]));
        
        int end = pairs[0][1];
        
        int count = 1;
        for(int i=1; i<pairs.length; i++){
            if(end < pairs[i][0]){
                count++;
                end = pairs[i][1];
            }
        }
        return count;
    }
}
