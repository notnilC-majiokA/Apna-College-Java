// number of ways to place 1xm size tiles on an nxm size floor
import java.util.Scanner;

public class Tile_Problem_Recursion {
    public static int placeTiles(int n, int m){
        if(n == m ){
            return 2;
        }
        if(n<m){
            return 1;
        }

        // place vertically
        int verticalCount = placeTiles(n-m, m);

        // place horizontally
        int horizontalCount = placeTiles(n-1, m);
        return verticalCount + horizontalCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the horizontal floor size :");
        int n = sc.nextInt();
        System.out.println("Enter the vertical floor size :");
        int m = sc.nextInt();
        int res = placeTiles(n, m);
        System.out.println("Total possible placements :"+res);
    }
}