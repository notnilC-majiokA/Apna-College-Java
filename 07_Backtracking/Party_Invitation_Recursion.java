// finding number of ways to invite people selected singly or pairwise
import java.util.Scanner;

public class Party_Invitation_Recursion {
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }
        // calling singly
        int countSingle = callGuests(n-1);

        // count pairwise
        int countPair = (n-1) * callGuests(n-2);

        return countSingle + countPair;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of guests in the party :");
        int n = sc.nextInt();
        int res = callGuests(n);
        System.out.println("Total number of inviting "+n+" guests to a party taken singly or pairwise is :"+res);
    }
}