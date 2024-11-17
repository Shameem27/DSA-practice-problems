public class BooleanMatrix {

    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;

        // Arrays to keep track of rows and columns that should be modified
        boolean[] rowMarker = new boolean[M];
        boolean[] colMarker = new boolean[N];

        // First pass to mark the rows and columns that should be modified
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    rowMarker[i] = true;
                    colMarker[j] = true;
                }
            }
        }

        // Second pass to modify the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (rowMarker[i] || colMarker[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 0},
            {0, 0}
        };

        int[][] mat2 = {
            {0, 0, 0},
            {0, 0, 1}
        };

        int[][] mat3 = {
            {1, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        };

        System.out.println("Modified matrix for mat1:");
        modifyMatrix(mat1);
        printMatrix(mat1);

        System.out.println("\nModified matrix for mat2:");
        modifyMatrix(mat2);
        printMatrix(mat2);

        System.out.println("\nModified matrix for mat3:");
        modifyMatrix(mat3);
        printMatrix(mat3);
    }
}