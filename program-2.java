import java.util.Scanner;

class OddSeriesGenerator {
  int a;

  OddSeriesGenerator(int a) {
    this.a = a;
  }

  void generateSeries() {
    for (int i = 1; i <= a; i++) {
      int odd = 2 * i - 1;
      System.out.print(odd);
      if (i != a) {
        System.out.print(", ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a : ");

    int a = sc.nextInt();

    OddSeriesGenerator series = new OddSeriesGenerator(a);
    series.generateSeries();
  }
}