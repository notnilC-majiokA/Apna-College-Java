import java.util.Scanner;

public class Array_Number_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt(); 
        }

         System.out.print("Enter the element to be searched : ");
         int e = sc.nextInt();
         int pos = 0;

         for(int j = 0; j < n; j++){
            System.out.print(array[j]+" ");
            if(e == array[j]){
                pos = j;
            }
         }
         System.out.println();
         System.out.printf("Required position of %d in the above array is = "+pos,e);
    }
}
