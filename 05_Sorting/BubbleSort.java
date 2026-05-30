import java.util.*;

public class BubbleSort{
    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }return arr;
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
        int[] result = bubbleSort(arr);
        System.out.println("The sorted array is : "+Arrays.toString(result));
    }
}
