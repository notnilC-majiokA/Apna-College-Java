import java.util.*;

public class Fibonacci_Recursion {
    public static void printFibonacci(int a, int b, int m){
        if(m == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, m-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here we are going to display the Fibonacci Series");
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n-2);
    }
}