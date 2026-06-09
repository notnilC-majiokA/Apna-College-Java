import java.util.*;

public class Remove_Duplicates_String_Recursion {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int i, String newStr){
        // Time Complexity O(n)
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, i+1, newStr);
        }else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, i+1, newStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in lowercase to remove all duplicates :");
        String str = sc.next();
        String newStr = "";
        removeDuplicate(str, 0, newStr);

    }
}