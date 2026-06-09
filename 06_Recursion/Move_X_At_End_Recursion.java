import java.util.*;

public class Move_X_At_End_Recursion {
    public static void moveX(int i, int count, String Str, String newStr){ // time complexity O(n)
        // base condition
        if(i == Str.length()){
            for(int j=0; j<count; j++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        if(Str.charAt(i) == 'x'){
            count++;
            moveX(i+1, count, Str, newStr);
        }else{
            newStr += Str.charAt(i);
            moveX(i+1, count, Str, newStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to move all x to its end :");
        String Str = sc.next();
        String newStr = "";
        moveX(0, 0, Str, newStr);
    }
}