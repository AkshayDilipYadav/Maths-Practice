import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[][] pascalTriangle = generateTriangle(A);
        printPascalTriangle(pascalTriangle);
    }

    public static int[][] generateTriangle(int A) {
        int[][] triangle = new int[A][A];

        for (int i = 0; i < A; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
    public static void printPascalTriangle(int[][] triangle){
for(int[] row : triangle){
    for(int value : row){System.out.print(value + " ");}
    System.out.println();

}
    }
}


