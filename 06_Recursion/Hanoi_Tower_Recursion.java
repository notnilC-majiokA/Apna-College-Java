import java.util.*;

public class Hanoi_Tower_Recursion{ 
    // time complexity O(2 powered n)
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here, we are going to display the algorithm for hanoi tower problems.");
        System.out.println("Enter the number of discs in the Source Tower :");
        int n = sc.nextInt();
        System.out.println("The steps are as follows :");
        towerOfHanoi(n, "S" ,"H",  "D");
    }
}