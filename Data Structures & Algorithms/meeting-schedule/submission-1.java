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
            Interval interval1 = intervals.get(i-1);
            Interval interval2 = intervals.get(i);

            if(interval1.end > interval2.start)
                return false;

        }
        return true;

    }
}
