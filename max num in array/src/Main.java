import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("the max element in the array is: " + max);

    }
}