class TimeMap {
    // private Map<String, Map<Integer, List<String>>> keyStore;

    // public TimeMap() {

    //     keyStore = new HashMap<>();
        
    // }
    
    // public void set(String key, String value, int timestamp) {
    //      keyStore.putIfAbsent(key, new HashMap<>());
    //         keyStore.get(key).putIfAbsent(timestamp, new ArrayList<>());
    //         keyStore.get(key).get(timestamp).add(value);
    // }
    
    // public String get(String key, int timestamp) {
    //     if (!keyStore.containsKey(key)) {
    //             return "";
    //         }

    //         return keyStore.get(key).entrySet().stream()
    //                 .filter(entry -> entry.getKey() <= timestamp)
    //                 .max(Map.Entry.comparingByKey())
    //                 .map(Map.Entry::getValue)
    //                 .filter(values -> !values.isEmpty())
    //                 .map(val -> val.get(val.size()-1))
    //                 .orElse("");

    private final Map<String, TreeMap<Integer, String>> keyStore = new HashMap<>();

        public void set(String key, String value, int timestamp) {
            keyStore.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            TreeMap<Integer, String> timestampToValue = keyStore.get(key);
            if (timestampToValue == null) return "";

            Map.Entry<Integer, String> floorEntry = timestampToValue.floorEntry(timestamp);
            return floorEntry == null ? "" : floorEntry.getValue();
    }
}
