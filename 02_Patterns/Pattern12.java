import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size from 1 to 9 : ");
        int n;
        do{
            System.out.print("Enter the size from 1 to 9 : ");
            n = sc.nextInt();
        }
        while((n<1) || (n>9));

        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}