import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){A[i] = sc.nextInt();}

        int B = sc.nextInt();
        int result = solve(A, B);
        System.out.println(result);
    }

    public static int solve(int[] A, int B){
        int MOD = 1000000007;

        int[] remainderCount = new int[B];

        int count = 0;

        for(int num : A){
            int remainder = num % B;
            if(remainder < 0){remainder += B;}
            remainderCount[remainder]++;
        }

        count = (count +(int)(((long)remainderCount[0] * (remainderCount[0] - 1)/2)% MOD))% MOD;

        for(int i = 1; i <= B/2; i++){
            if(i == B - i){
                count = count = (count +(int)(((long)remainderCount[i] * (remainderCount[i] - 1)/2)% MOD))% MOD;
            }
            else{
                count = (count + (int)(((long)remainderCount[i] * remainderCount[B - i])% MOD))%MOD;
            }


        }

        return count;
    }


}