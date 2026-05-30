import java.util.*;

public class InsertionSort{
    public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // taking elements from user
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is : "+Arrays.toString(arr));
        int[] result = insertionSort(arr);
        System.out.println("The sorted array is : "+Arrays.toString(result));
    }
}
