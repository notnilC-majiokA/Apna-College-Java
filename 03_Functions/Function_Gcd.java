import java.util.Scanner;

public class Function_Gcd {
    public static void calcGcd(int a, int b){
        if((a > 0) && (b > 0)){
            int track = 1;
            int gcd = 1;
            while((track <= a) && (track <= b)){
                if((a % track == 0) && (b % track == 0)){
                    gcd = track;
                }
                track++;
            }
            System.out.printf("The Greatest Common Divisor of %d and %d is : "+gcd,a,b);
        }else{
            System.out.println("GCD not defined for non positive integers!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        calcGcd(a, b);
    }
}