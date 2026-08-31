import java.util.Scanner;

public class Matrix_Spiral_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int rows = sc.nextInt();
        System.out.print("Enter the column : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral oder matrix is : ");

        int row_start = 0;
        int row_end = rows-1;
        int col_start = 0;
        int col_end = columns-1;

        while((row_start <= row_end) && (col_start <= col_end)){
            for(int col = col_start; col <= col_end; col++){
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;

            for(int row = row_start; row <= row_end; row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;

            for(int col = col_end; col >= col_start; col--){
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;

            for(int row = row_end; row >= row_start; row--){
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
        }
    }
}
