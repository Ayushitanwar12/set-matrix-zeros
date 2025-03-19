public class setmatrixzero{
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isrow = false;
        boolean iscolumn = false;

        // Step 1: Mark rows and columns that need to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the first column
                    matrix[0][j] = 0; // Mark the first row
                    if (i == 0) isrow = true;
                    if (j == 0) iscolumn = true;
                }
            }
        }

        // Step 2: Set matrix elements to zero based on the first row and column markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row and first column
        if (isrow) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if (iscolumn) {
            for (int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }
    }

    // Main method to test the setZeroes function
    public static void main(String[] args) {
        // Create an instance of Solution
    setmatrixzero solution = new setmatrixzero();

        // Sample matrix for testing
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        // Output matrix before calling setZeroes
        System.out.println("Matrix before setZeroes:");
        printMatrix(matrix);

        // Call the setZeroes method
        solution.setZeroes(matrix);

        // Output matrix after calling setZeroes
        System.out.println("\nMatrix after setZeroes:");
        printMatrix(matrix);
    }

    // Utility method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

    

