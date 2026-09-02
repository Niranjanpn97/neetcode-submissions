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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));

        for(int i=1;i<intervals.size();i++)
        {
            Interval interval1 = intervals.get(i);
            Interval interval2 = intervals.get(i-1);

            if(interval2.end > interval1.start)
                return false;

        }
        return true;

    }
}
