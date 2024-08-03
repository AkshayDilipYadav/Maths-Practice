import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int[] result = primes(A);
        for(int prime : result){System.out.print(prime + " ");}
        System.out.println();
    }

    public static int[] primes(int A){

        if(A < 2){return new int[0];}

        boolean[] isPrime = new boolean[A + 1];
        for(int i = 2; i <= A; i++){isPrime[i] = true;}

        for(int i = 2; i*i <= A; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= A; j += i){isPrime[j] = false;}
            }
        }

        int primeCount = 0;
        for(int i = 2; i <= A; i++){
            if(isPrime[i]){primeCount++;}
        }
        int[] primeArray = new int[primeCount];
        int index = 0;
        for(int i = 2; i <= A; i++){
            if(isPrime[i]){primeArray[index++] = i;}
        }
        return primeArray;
    }

}