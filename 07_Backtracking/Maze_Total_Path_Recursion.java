import java.util.Scanner;

public class Maze_Total_Path_Recursion {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPath(i+1, j, n, m);

        // move rightwards
        int rightPaths = countPath(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the abscissa:");
        int n = sc.nextInt();
        System.out.println("Enter the ordinate:");
        int m = sc.nextInt();
        int res = countPath(0, 0, n, m);
        System.out.println("Total paths possible is : "+res);
    }
}