import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter matrix size: ");
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("enter the matrix elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("the transposed matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}