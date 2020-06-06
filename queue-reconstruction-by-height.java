// https://leetcode.com/problems/queue-reconstruction-by-height/
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
