//Program to check parity of a number using bitwise operation
import java.util.*;

public class EvenOddBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its parity:");
        int n = sc.nextInt();
        int bitMask = 1<<0; // to check bit type at 0 position of number

        if((bitMask & n) == 0){
            System.out.println(n+" is an even number."); // even numbers have 0 bit at 0 position
        }else{
            System.out.println(n+" is an odd number"); // odd numbers have 1 bit at 0 position
        }
    }
}