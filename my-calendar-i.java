// https://leetcode.com/problems/my-calendar-i/
class MyCalendar {

    // tc -> n^2, sc-> n
    List<int[]> meetingTimes;
    
    public MyCalendar() {
        meetingTimes = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
                
        //meetingTimes.sort((a,b) -> a[0]-b[0]);
        
        for(int[] interval : meetingTimes){
            if(interval[0]<end && start < interval[1]){
                return false;
            }
        }
        
        meetingTimes.add(new int[]{start, end});
        
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
