class Max1sRow {
    static int rowWithMax1s(int[][] mat, int n, int m) {
        int max_row_index = -1;
        int max_1s = -1;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > max_1s) {
                max_1s = count;
                max_row_index = i;
            }
        }
        return max_row_index;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 0, 1, 1}
        };
        
        System.out.println("Row with maximum 1s: " + rowWithMax1s(mat, 4, 4));
    }
}
