import java.util.*;

public class String_Reversal_Recursion{
    // time complexity O(n)
    public static void printRev(String str, int i){
        if(i < 0){
            return;
        }
        System.out.print(str.charAt(i));
        printRev(str, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here we are going to reverse a string.");
        System.out.println("Enter a string :");
        String str = sc.next();
        int n = str.length()-1;
        System.out.println("The reversed string is :");
        printRev(str, n);
    }
}