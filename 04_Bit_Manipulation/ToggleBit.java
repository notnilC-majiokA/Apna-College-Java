import java.util.*;

public class ToggleBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position to toggle:");
        int pos = sc.nextInt();

        // create a bitmask
        int bitMask = 1<<pos;
        // proform XOR operation to toggle the bit
        int newNumber = n ^ bitMask;

        System.out.println("The original number is: "+ n);
        System.out.println("Number after toggling bit at position "+pos+" is: " +newNumber);
        sc.close();
    }
}