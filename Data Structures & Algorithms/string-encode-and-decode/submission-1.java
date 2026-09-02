class Solution {

    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String word : strs) {
            encoded.append(word.length()).append('-').append(word);
        }
        return encoded.toString();
    }

    public static List<String> decode(String encodedStr) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < encodedStr.length()) {
            int dashIndex = encodedStr.indexOf('-', index);

            int wordLength = Integer.parseInt(encodedStr.substring(index, dashIndex));
            int wordStart = dashIndex + 1;
            String word = encodedStr.substring(wordStart, wordStart + wordLength);
            result.add(word);
            index = wordStart + wordLength;
        }

        return result;
    }
}
