import java.util.Scanner;

public class Array_Max_Min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
           array[i] = sc.nextInt(); 
        }

        int max = array[0];
        int min = array[0];

        for(int i = 1; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }else{
                min = array[i];
            }
        }
        System.out.println("The maximum number is : "+max);
        System.out.println("The minimum number is : "+min);
    }
}