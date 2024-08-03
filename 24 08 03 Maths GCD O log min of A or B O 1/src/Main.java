import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int result = gcd(A, B);

        System.out.println(result);
    }

    public static int gcd(int A, int B){
        while(B != 0){
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }
}