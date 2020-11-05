// https://leetcode.com/problems/summary-ranges/
class Solution {
    // tc -> n, sc-> n
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            
            while(i < nums.length-1 && nums[i+1]==nums[i]+1){
                i++;
            }
            
            if(nums[i] != num){
                result.add(num + "->" + nums[i]);
            }
            
            else{
                result.add(String.valueOf(nums[i]));
            }
        }
        
        return result;
    }
}
