import java.util.*;

public class Exponent_Recursion {
    public static int calcExponent(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        //case for even
        if(n%2 == 0){
            return calcExponent(x, n/2) * calcExponent(x,n/2);
        }else{ // case for odd
            return calcExponent(x, n/2) * calcExponent(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int x = sc.nextInt();
        System.out.println("Enter the exponent :");
        int n = sc.nextInt();
        int res = calcExponent(x, n);
        System.out.println(x+" to the power "+n+" = "+res);
    }
}