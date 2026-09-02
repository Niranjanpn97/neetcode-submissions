class Solution {
    public int numDecodings(String s) {
         if (s == null || s.isEmpty() || s.charAt(0) == '0') return 0;

        // twoBack = ways to decode up to index i-2
        // oneBack = ways to decode up to index i-1
        int twoBack = 1;   // empty-string base case
        int oneBack = 1;   // first char is valid (checked above)

        for (int i = 1; i < s.length(); i++) {
            int waysAtCurrentIndex = 0;

            // Single-digit decode: s[i] alone maps to a letter (1-9, not '0')
            if (s.charAt(i) != '0') {
                waysAtCurrentIndex += oneBack;
            }

            // Two-digit decode: s[i-1..i] maps to a letter (10-26)
            int twoDigitNumber = Integer.parseInt(s.substring(i - 1, i + 1));
            if (twoDigitNumber >= 10 && twoDigitNumber <= 26) {
                waysAtCurrentIndex += twoBack;
            }

            // Slide the window forward
            twoBack = oneBack;
            oneBack = waysAtCurrentIndex;
        }

        return oneBack;
        
    }
}
