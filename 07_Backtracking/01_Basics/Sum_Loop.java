import java.util.Scanner;

public class Sum_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want the sum : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.printf("The sum of first %d natural numbers is : %d",n,sum);
    }
}
