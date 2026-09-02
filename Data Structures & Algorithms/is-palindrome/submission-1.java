class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        String temp = filtered.toString().replace(" ","");  // only alphanumeric, all lowercase

        // Original logic preserved exactly as-is
        boolean pal = false;
        if(temp.length()<=1) return true;
        for (int i = 0; i < temp.length() - 1; i++) {
            char ch  = temp.charAt(i);
            char ch1 = temp.charAt(temp.length() - 1 - i);
            if (ch != ch1) {
                pal = false;
                break;
            } else {
                pal = true;
            }
        }
        return pal;
    }
}
