import java.util.Scanner;

public class number_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.printf("%d is greater than %d",a,b);
        }else if(a < b){
            System.out.printf("%d is lesser than %d",a,b);
        }else{
            System.out.printf("%d is equal to %d",a,b);
        }
    }
}
