class Solution {
    public int numIslands(char[][] grid) {
       if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};

        for (int currentRow = 0; currentRow < rows; currentRow++) {
            for (int currentCol = 0; currentCol < cols; currentCol++) {
                if (grid[currentRow][currentCol] == '1') {
                    islands++;
                    Queue<int[]> bfsQueue = new LinkedList<>();
                    bfsQueue.offer(new int[]{currentRow, currentCol});
                    grid[currentRow][currentCol] = '0';
                    while (!bfsQueue.isEmpty()) {
                        int[] currentCell   = bfsQueue.poll();
                        int   processingRow = currentCell[0];
                        int   processingCol = currentCell[1];
                        for (int[] direction : directions) {
                            int neighborRow = processingRow + direction[0];
                            int neighborCol = processingCol + direction[1];
                            if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols
                                    && grid[neighborRow][neighborCol] == '1') {
                                grid[neighborRow][neighborCol] = '0';
                                bfsQueue.offer(new int[]{neighborRow, neighborCol});
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }
}
