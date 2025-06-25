import java.util.Scanner;

class MultipleCounter {
  int[] numbers;

  MultipleCounter(int[] numbers) {
    this.numbers = numbers;

  }

  void countMultiples() {
    int[] count = new int[10];
    for (int i = 1; i <= 9; i++) {
      for (int num : numbers) {
        if (num % i == 0) {
          count[i]++;
        }
      }
    }

    System.out.print("{");
    for (int i = 1; i <= 9; i++) {
      System.out.print(i + " : " + count[i]);
      if (i != 9) {
        System.out.print(" , ");
      }
    }

    System.out.println("}");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] inputArray = new int[n];

    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
      inputArray[i] = sc.nextInt();
    }

    MultipleCounter mc = new MultipleCounter(inputArray);
    mc.countMultiples();
  }
}
