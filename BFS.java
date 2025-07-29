import java.util.*;

class BFS {

    /**
     * Performs Breadth-First Search (BFS) to find a path in a maze.
     * @param maze 2D maze array: 0 = free, 1 = wall, 9 = goal
     * @param startX Starting X coordinate
     * @param startY Starting Y coordinate
     * @param path Output list storing path from start to goal (in reverse)
     * @return true if path is found, false otherwise
     */
    public static boolean searchpath(int[][] maze, int startX, int startY, List<Integer> path) {
        final int rows = maze.length;
        final int cols = maze[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        int[][] parent = new int[rows][cols]; // For tracking the path

        // Initialize parent to -1 (no parent)
        for (int i = 0; i < rows; i++) {
            Arrays.fill(parent[i], -1);
        }

        // Start from the source
        queue.add(new int[]{startX, startY});
        visited[startY][startX] = true;

        final int[] dx = {-1, 1, 0, 0}; // Left, Right
        final int[] dy = {0, 0, -1, 1}; // Up, Down

        int goalX = -1, goalY = -1;

        // BFS Loop
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // Goal found
            if (maze[y][x] == 9) {
                goalX = x;
                goalY = y;
                break;
            }

            // Explore all 4 directions
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (isValid(nx, ny, cols, rows) &&
                    !visited[ny][nx] &&
                    maze[ny][nx] != 1) { // Not a wall

                    queue.add(new int[]{nx, ny});
                    visited[ny][nx] = true;
                    parent[ny][nx] = y * cols + x; // Store parent as linear index
                }
            }
        }

        // Reconstruct path from goal to start
        if (goalX != -1 && goalY != -1) {
            int x = goalX, y = goalY;
            while (parent[y][x] != -1) {
                path.add(x);
                path.add(y);
                int parentIndex = parent[y][x];
                x = parentIndex % cols;
                y = parentIndex / cols;
            }
            path.add(startX);
            path.add(startY);
            return true;
        }

        return false; // Goal not reachable
    }

    // Helper to check if a cell is within maze bounds
    private static boolean isValid(int x, int y, int cols, int rows) {
        return x >= 0 && y >= 0 && x < cols && y < rows;
    }
}
