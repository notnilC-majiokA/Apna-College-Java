// Program to check if a number is a power of two using Bit Manipulation
import java.util.*;

public class Power2Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if a number is a power of 2:");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(n+" is not a power of 2");
        }else if((n & (n-1)) == 0){
            System.out.println(n+" is a power of 2"); // powers of 2 and its previous number return 0 on performing bitwise & operation
        }else{
            System.out.println(n+" is not a power of 2");
        }
    }
}
