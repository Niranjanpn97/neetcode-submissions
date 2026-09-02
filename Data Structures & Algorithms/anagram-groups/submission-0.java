class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> strCount = new HashMap<>();
        for (String str : strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String key = new String(s);
            if(!strCount.containsKey(key)) {
                strCount.put(key, new ArrayList<>());
            }
            strCount.get(key).add(str);

        }

        return new ArrayList<>(strCount.values());

        
    }
}
