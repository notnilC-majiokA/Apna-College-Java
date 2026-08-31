import java.util.Scanner;

public class Matrix_Number_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = sc.nextInt();
            }
        } 
        System.out.print("Enter the number to be searched : ");
        int x = sc.nextInt();
        int r = 0;
        int c = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(array[i][j] == x){
                    r = i;
                    c = j;
                }
            }
        }
        if((r == 0) && (c == 0)){
            System.out.println("The number is not present.");
        }else{
            System.out.print("The number is present in position : "+(r+1)+","+(c+1));
        }

    }
}