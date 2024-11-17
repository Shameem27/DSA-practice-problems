class RatInMaze {
    static boolean isSafe(int[][] maze, int x, int y, int N) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int N) {
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y, N)) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol, N))
                return true;
            if (solveMazeUtil(maze, x, y + 1, sol, N))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    static boolean solveMaze(int[][] maze, int N) {
        int[][] sol = new int[N][N];
        if (!solveMazeUtil(maze, 0, 0, sol, N)) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int N = 4;
        solveMaze(maze, N);
    }
}
