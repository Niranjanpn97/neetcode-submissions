class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int best = 0, start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

           Integer indexThatWeLastSaw =  lastSeen.getOrDefault(c, -1);

           if(indexThatWeLastSaw>= start )
           {
               start = indexThatWeLastSaw +1;

           }

           lastSeen.put(c, end);
           best = Math.max(best, end - start + 1);
        }

        return best;
        // Set<Character> set = new HashSet<>();
        // for(char c: s.toCharArray())
        // {
        //     set.add(c);
        // }
        
        // return set.size();
    }
}
