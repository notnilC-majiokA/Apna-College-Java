import java.util.*;

public class NumberSystemConverter{
    // function to convert decimal to binary string
    public static String decimalToBinary(int n){
        if(n == 0){
            return "0";
        }
        String binaryStr = "";
        while(n>0){
            int remainder = n%2;
            binaryStr = remainder + binaryStr;
            n = n / 2;
        }
        return binaryStr;
    }
    // function to convert binary string to decimal
    public static int binaryToDecimal(String str){
        int decimalNum = 0;
        int power = 0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == '1'){
                decimalNum += Math.pow(2,power);
            }
            power++;
        }return decimalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to binary:");
        int n = sc.nextInt();
        String binaryResult = decimalToBinary(n);
        System.out.println("Binary equivalent of "+n+" is "+binaryResult);

        System.out.println("Enter a binary string to convert to decimal:");
        String str = sc.next();
        int decimalResult = binaryToDecimal(str);
        System.out.println("Decimal equivalent of "+str+" is "+decimalResult);
    }
}