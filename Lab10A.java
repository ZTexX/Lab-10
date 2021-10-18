import java.util.Scanner;

class Lab10A {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[10];
    int targetNum;

    System.out.println("Please enter 10 numbers:");

    for (int i = 0; i < numbers.length; i++) {
      do {
        System.out.print("Integer " + (i + 1) + ": ");
        numbers[i] = sc.nextInt();
      } while (numbers[i] < -100 || numbers[i] > 100);
    }

    System.out.print("\nWhat is the target number: ");
    targetNum = sc.nextInt();

    if (isInSet(targetNum, numbers)) {
      System.out.println("\nThe target is in the set.");
    } else System.out.println("\nThe target is not in the set.");
  }

  private static boolean isInSet(int num, int[] numbers) {
    for (int i : numbers) {
      if (i == num) return true;
    }

    return false;
  }
}