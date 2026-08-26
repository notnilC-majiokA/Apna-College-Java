import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = i+1; j > 0; j--){
                System.out.print(j);
            }
            for(int j = 2; j < i+2; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}