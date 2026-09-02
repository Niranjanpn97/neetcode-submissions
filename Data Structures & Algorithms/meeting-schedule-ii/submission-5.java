/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.isEmpty()) return 0;
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends   = new int[n];
        for(int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i]   = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);   

        int rooms = 0;
        int endPtr = 0; 

        for(int i = 0; i < n; i++) {
            if(starts[i] >= ends[endPtr]) {
                endPtr++;
            } else {
                rooms++;
            }
        }

        return rooms;

    }
}
