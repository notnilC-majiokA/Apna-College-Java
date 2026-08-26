import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter half pyramid size : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 2*(n-i-1); j >= 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 2*(n-i); j >= 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
