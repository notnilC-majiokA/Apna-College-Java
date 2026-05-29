// Program to count bits in binary representation of a number
import java.util.*;

public class CountBits{
    public static int countBits(int choice, int n){
        int count0 = 0;
        int count1 = 0;
        if(n == 0){
            return -1;
        }
        if(n<0){
            return -2;
        }
        for(int i = 0; i<32; i++){ // accounts for 32 bit allocation in int type
            if((n & 1) == 0){
                count0++;
            }else{
                count1++;
            }
            n = n >> 1;
        }
        if(choice == 1){
            return count0;
        }else{
            return count1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to count the bits in its binary representation:");
        int n = sc.nextInt();
        System.out.println("Enter your choice from the following:\n"+"1. Count 0\n"+"2. Count 1");
        int choice = sc.nextInt();

        int result = countBits(choice, n);
        if(result == -2){
            System.out.println("Please enter a positive integer.");
        }else if(result == -1){
            System.out.println("Zero has no significant bits.");
        }else{
            if(choice == 1){
                System.out.println("The number of 0 in binary representation of "+n+" is "+result);
            }else if(choice == 2){
                System.out.println("The number of 1 in binary representation of "+n+" is "+result);
            }else{
                System.out.println("Invalid Choice");
            }
        }
    }
}
