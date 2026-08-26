import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int b = sc.nextInt();

        for(int i = 0; i < l; i++){
            for(int j = 0; j < b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
