import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        fillIn(arr, size);
        quickSort(arr, 0, arr.length-1);
        display(arr);
    }
    public static void quickSort(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int pivot = arr[j];
        int left = i;
        int right = j;
        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            swap(arr, left, right);
        }
        swap(arr, left, j);
        quickSort(arr, i, left-1);
        quickSort(arr, left+1, j);
    }
    public static void fillIn(int[] arr, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
    }
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}