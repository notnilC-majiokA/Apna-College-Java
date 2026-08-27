import java.util.Scanner;

public class Function_Factorial {
    public static void calcFactorial(int n){
        int fact = 1;
        if(n < 0){
            System.out.println("Fcatorial not defined.");
        }else if(n == 0){
             System.out.printf("%d ! = 1",n);
        }else{
            for(int i = n; i >= 1; i--){
            fact = fact*i;
        }
        System.out.printf("%d ! = "+fact,n);
        return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non negative number : ");
        int n = sc.nextInt();

        calcFactorial(n);
    }
}
