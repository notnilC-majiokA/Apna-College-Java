import java .util.Scanner;

public class parity_check {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        //checking parity
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}