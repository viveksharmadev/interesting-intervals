// https://leetcode.com/problems/queue-reconstruction-by-height/
/* 1. Pick out tallest group of people and sort them in a subarray (S). Since there's no other groups of people taller than them, therefore each guy's index will be just as same as his k value.
2. For 2nd tallest group (and the rest), insert each one of them into (S) by k value. So on and so forth.
E.g.
input: [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
subarray after step 1: [[7,0], [7,1]]
subarray after step 2: [[7,0], [6,1], [7,1]]*/
class queue-reconstruction-by-height {
    // tc -> n^2 + nlogn -> n^2, sc-> n
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2)-> (p1[0]==p2[0]
                                      ? p1[1]-p2[1]
                                      : p2[0]-p1[0]));
        List<int[]> res = new LinkedList<>();
        // tc-> n^2
        for(int[] p : people){ // tc-> n
            res.add(p[1], p);  // t-> n
        }
        
        return res.toArray(new int[][]{});
    }
}
