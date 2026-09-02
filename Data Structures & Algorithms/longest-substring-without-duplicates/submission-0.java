class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int best = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
//             getOrDefault(-1) acts as "never seen" — no fill required

           Integer indexThatWeLastSaw =  lastSeen.getOrDefault(c, -1);

           if(indexThatWeLastSaw>= start )
           {
               start = indexThatWeLastSaw +1;

           }

           lastSeen.put(c, end);
           best = Math.max(best, end - start + 1);
        }

        return best;
    }
}
