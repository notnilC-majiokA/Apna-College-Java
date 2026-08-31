import java.util.Scanner;

public class Array_Check_Sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The entered array is : ");

        for(int i = 0; i < n; i++){
            if(i == (n-1)){
                System.out.println(array[i]);
            }else{
                System.out.print(array[i]+",");
            }
        }
        boolean isAscending = true;
        for(int i = 0; i < n-1; i++){
            if(array[i] > array[i+1]){
                isAscending = false;
            }
        }
        if(isAscending == true){
            System.out.println("The array is in Ascending oder.");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
}