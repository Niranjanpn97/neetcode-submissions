class Solution {
    public boolean checkValidString(String s) {
         int minOpen = 0; // fewest possible unmatched '(' (all '*' act as ')' or "")
        int maxOpen = 0; // most  possible unmatched '(' (all '*' act as '(')

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> { minOpen++; maxOpen++; }
                case ')' -> { minOpen--; maxOpen--; }
                case '*' -> { minOpen--; maxOpen++; } // shrink lower, grow upper bound
            }

            // Even in the best case (every '*' = '('), too many ')' → impossible
            if (maxOpen < 0) return false;

            // Open count can never go negative; clamp the lower bound
            if (minOpen < 0) minOpen = 0;
        }

        // Valid if there is some way to assign '*' that leaves no unmatched '('
        return minOpen == 0;
    }
}
