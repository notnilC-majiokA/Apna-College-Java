// printing the subsets of first n natural numbers
import java.util.*;

public class Subset_Natural_Number_Recursion {
    public static void printSubset(ArrayList<Integers> subset){
        for(int i=0; i<sunset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integers> subset ){
        if(n == 0){
            printSubset(subset);
            return;
        }
        // in case element is chosen
        subset.add(n);
        findSubset(n-1, subset);

        // in case element is noyt chosen
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int n = sc.nextInt();
        ArrayList<Integers> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}