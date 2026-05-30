import java.util.*;

public class SelectionSort{
    public static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] result = selectionSort(arr);
        System.out.println("The sorted array is : "+Arrays.toString(result));
    }
}
