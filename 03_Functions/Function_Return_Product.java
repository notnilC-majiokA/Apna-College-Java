import java.util.Scanner;

public class Function_Return_Product {
    public static int calcSum(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.printf("The product of %d and %d is : "+calcSum(a, b),a,b);
    }
}