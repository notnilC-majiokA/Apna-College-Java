import java.util.*;

public class Strictly_Increasing_Check_Recursion {
    public static boolean isSorted(int arr[], int i){
        // time complexity O(n)
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            // array is sorted till now
            return isSorted(arr, i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        boolean res = isSorted(arr, 0);
        if(res == true){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is unsorted.");
        }
    }
}