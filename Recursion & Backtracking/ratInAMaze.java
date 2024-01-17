class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], false);
        }
        ArrayList<String> paths = new ArrayList<>();
        solve(n, paths, "", 0, 0, m, visited);
        return paths;
    }
    
    
    public static void solve(int n, ArrayList<String> paths, String path, int row, int col, int[][] grid, boolean[][] visited){
        if (row == n - 1 && col == n - 1 && grid[row][col] == 1) {
            paths.add(path);
            return;
        }
        
        boolean outside = row < 0 || row >= n || col < 0 || col >= n;
        if (outside || visited[row][col] || grid[row][col] == 0) return;
        
        
        visited[row][col] = true;
        // visit all the neighbouring cells
        solve(n, paths, path + "D", row + 1, col, grid, visited);
        solve(n, paths, path + "L", row, col - 1, grid, visited);
        solve(n, paths, path + "R", row, col + 1, grid, visited);
        solve(n, paths, path + "U", row - 1, col, grid, visited);
        
        visited[row][col] = false;
    }
}
