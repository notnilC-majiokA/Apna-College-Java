import java.util.Scanner;

public class Function_Fibonacci {
    public static void printFibonacci(int n){
        System.out.printf("The first %d terms of Fibonacci Series is as follows : \n",n);
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2; i < n; i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}