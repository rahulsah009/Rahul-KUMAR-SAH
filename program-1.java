import java.util.Scanner;

class calculator {
  double a, b;
  String operation;

  calculator(double a, double b, String operation) {
    this.a = a;
    this.b = b;
    this.operation = operation;

  }

  void calculate() {
    switch (operation.toLowerCase()) {
      case "add":
        System.out.println("Result: " + (a + b));
        break;
      case " subs":
        System.out.println("Result: " + (a - b));
        break;
      case "multi":
        System.out.println("Result: " + (a * b));
        break;
      case "div":
        if (b != 0) {
          System.out.println("Result: " + (a / b));
        } else {
          System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      default:
        System.out.println("error: Invalid operation");

    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    double a = sc.nextDouble();
    System.out.print("Enter b: ");
    double b = sc.nextDouble();
    System.out.print("Enter operation (add, subs, multi, div): ");
    String operation = sc.next();
    calculator calc = new calculator(a, b, operation);
    calc.calculate();
  }
}