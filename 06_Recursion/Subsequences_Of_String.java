import java.util.*;

public class Subsequences_Of_String {
    public static void subSequences(String str, int i, String newStr, HashSet<String> set){
        // time complexity O(2 powered n)
        if(i == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(i);
        // to include
        subSequences(str, i+1, newStr+currChar,set);
        // to not include
        subSequences(str, i+1, newStr,set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print its sub sequence :");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "", set);
    }
}