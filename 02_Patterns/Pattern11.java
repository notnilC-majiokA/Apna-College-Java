import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rhombus : ");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
