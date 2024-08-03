import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String result = convertToTitle(A);
        System.out.println(result);
    }

    public static String convertToTitle(int A){
        StringBuilder result = new StringBuilder();

        while(A > 0){
            A--;
            char currentChar = (char)('A' + (A % 26));
            result.insert(0, currentChar);
            A /= 26;
        }
        return result.toString();
    }
}