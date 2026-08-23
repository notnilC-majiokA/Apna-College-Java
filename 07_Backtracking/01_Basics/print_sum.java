import java.util.Scanner;

public class print_sum{
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // calculating sum
        int sum = a + b;
        System.out.print("The required sum is : ");
        System.out.println(sum);
    }
}