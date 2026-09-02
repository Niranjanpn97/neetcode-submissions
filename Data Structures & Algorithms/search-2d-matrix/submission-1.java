class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> li = Arrays.stream(matrix).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
        if(li.contains(target)) return li.contains(target);
        return false;
    }
}
