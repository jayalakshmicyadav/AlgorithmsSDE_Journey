import java.util.Scanner;

public class AddMatrix {
    public static void main(String args[]) {
        int n, i, j;
        Scanner in = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the matrix order N");
        n = in.nextInt();

        // Memory allocation for the matrices
        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        int res[][] = new int[n][n];

        // Input elements for Matrix 1
        System.out.println("Enter the elements of matrix1");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat1[i][j] = 1;
            }
        }

        // Input elements for Matrix 2
        System.out.println("Enter the elements of matrix2");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat2[i][j] = in.nextInt();
            }
        }

        // Matrix Addition Logic
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Displaying the Resulting Matrix
        System.out.println("Sum of matrices:-");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println(); // Moves to the next line after printing a row
        }

        in.close(); // Good practice: closes the scanner leak
    }
}
