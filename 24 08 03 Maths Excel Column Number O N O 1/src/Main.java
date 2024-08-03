import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String A = sc.nextLine();
       int result = convertToNumber(A);
       System.out.println(result);
    }

    public static int convertToNumber(String A){
        int result = 0;
        for(char c : A.toCharArray()){
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}