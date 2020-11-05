// https://leetcode.com/problems/string-compression/
class Solution {
    // tc -> n, sc-> 1
    public int compress(char[] chars) {
        int lenIndex = 0;
        
        for(int i=0; i<chars.length;){
            
            chars[lenIndex] = chars[i];
            
            int j = i+1;
            
            while(j<chars.length && chars[j]==chars[i]){
                j++;
            }
            
            if(j-i > 1){ // Need compression
                
                String freq = String.valueOf(j-i);
                
                for(int k=0; k<freq.length(); k++){
                    chars[++lenIndex] = freq.charAt(k);
                }
            }
            
            lenIndex++;
            
            i = j;
            
        }
        
        return lenIndex;
    }
}
