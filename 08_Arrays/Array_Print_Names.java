import java.util.Scanner;

public class Array_Print_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        String[] array = new String[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}