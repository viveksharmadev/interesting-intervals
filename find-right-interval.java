// https://leetcode.com/problems/find-right-interval/
class Solution {
    // tc -> n^2, sc-> n
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=0; j<n; j++){
                if(intervals[j][0]>=intervals[i][1] && intervals[j][0] < min){
                    min = intervals[j][0];
                    minIndex = j;                    
                }
            }
            res[i] = minIndex;
        }
        return res;
    }
}
