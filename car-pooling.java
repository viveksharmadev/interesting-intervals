// https://leetcode.com/problems/car-pooling/
class Solution {
    // tc -> 1(Max(1001, trips.length)), sc-> 1(1001)
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timestamps = new int[1001];
        
        for(int[] trip : trips){
            timestamps[trip[1]] += trip[0];
            timestamps[trip[2]] -= trip[0];
        }
        
        int usedCapacity = 0;
        for(int i : timestamps){
            usedCapacity += i;
            
            if(usedCapacity > capacity)
                return false;
        }
        
        return true;        
    }
}
