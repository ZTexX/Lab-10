import java.util.Scanner;
import java.util.Arrays;

class Lab10B {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[11];
    int targetNum;

    System.out.println("Please enter 11 numbers:");

    for (int i = 0; i < numbers.length; i++) {
      do {
        System.out.print("Integer " + (i + 1) + ": ");
        numbers[i] = sc.nextInt();
      } while (numbers[i] < -100 || numbers[i] > 100);
    }

    bubbleSort(numbers);

    System.out.print("\nWhat is the target number: ");
    targetNum = sc.nextInt();

    System.out.print("\nThe sorted set is: ");

    for (int i : numbers) {
      System.out.print(i + " ");
    }

    System.out.println();

    if (binarySearch(numbers, 0, numbers.length, targetNum)) {
      System.out.println("\nThe target is in the set.");
    } else System.out.println("\nThe target is not in the set.");
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  private static boolean binarySearch(int[] arr, int low, int high, int target) {
    int mid;

    while (true) {
      mid = (low + high) / 2;

      System.out.println("\nLow is " + low);
      System.out.println("\nHigh is " + high);
      System.out.println("\nMid is " + mid);
      System.out.println("\nSearching");

      if (target == arr[mid]) return true;
      if (target < arr[mid]) {
        high = mid;
      } else low = mid;

      if (low >= high - 1) return false;
    }
  }
}