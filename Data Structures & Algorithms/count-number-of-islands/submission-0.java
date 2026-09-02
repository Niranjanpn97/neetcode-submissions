class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    Deque<int[]> queue = new ArrayDeque<>();
                    queue.offer(new int[]{r, c});
                    grid[r][c] = '0';
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int row = cell[0], col = cell[1];

                        for (int[] dir : dirs) {
                            int nr = row + dir[0];
                            int nc = col + dir[1];

                            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                                    && grid[nr][nc] == '1') {
                                grid[nr][nc] = '0';
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }
}
