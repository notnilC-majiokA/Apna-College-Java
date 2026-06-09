import java.util.*;

public class First_Last_Char_Occurrance_In_String_Recursion {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurrance(String str, int i, char e){
        if(i == str.length()){
            System.out.println("First occurrance :"+first);
            System.out.println("Last occurrance :"+last);
            return;
        }
        char currChar = str.charAt(i);
        if(currChar == e){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }
        findOccurrance(str, i+1, e);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.next();
        System.out.println("Enter an element to find it first and last occurance in "+str);
        char e = sc.next().charAt(0);
        findOccurrance(str, 0, e);
    }
}