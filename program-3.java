import java.util.Scanner;

class OddNumberGenerator {
  int a;

  OddNumberGenerator(int a) {
    this.a = a;
  }

  void generateSeries() {
    for (int i = 0; i < a; i++) {
      int odd = 2 * i + 1;
      System.out.print(odd);
      if (i != a - 1) {
        System.out.print(", ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a : ");
    int a = sc.nextInt();

    OddNumberGenerator obj = new OddNumberGenerator(a);
    obj.generateSeries();
  }
}
