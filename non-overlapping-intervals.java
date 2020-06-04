// https://leetcode.com/problems/non-overlapping-intervals/
class non-overlapping-intervals {
    // tc -> nlogn, sc-> n
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        if(intervals==null || intervals.length==0) return count;
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]>=end){
                end = intervals[i][1];
            }else{
                count++;
            }
        }
        return count;
    }
}
