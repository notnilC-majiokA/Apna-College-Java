import java.util.Scanner;

public class Matrix_Transpose {
    public static void printTranspose(int array[][]){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columnns : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose matrix is : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }
}