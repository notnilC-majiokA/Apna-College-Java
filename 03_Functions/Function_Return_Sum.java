import java.util.Scanner;

public class Function_Return_Sum {
    public static int calcSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int sum = calcSum(a, b);
        System.out.printf("The sum of %d and %d is : "+sum,a,b);
    }
}