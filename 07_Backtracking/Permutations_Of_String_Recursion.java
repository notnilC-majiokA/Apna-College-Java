import java.util.Scanner;

public class Permutations_Of_String_Recursion {
    public static void printPermutations(String str,String permutation){
        // time complexity O(n!)
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr, permutation + currChar);
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print all permutations :");
        String str = sc.next();
        System.out.println("The following are the permutations :");
        printPermutations(str, "");
    }
}