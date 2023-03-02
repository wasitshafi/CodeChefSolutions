
/**
 * @author WasitShafi
 * @since 07-DEC-2022
 */
// Question: https://www.codechef.com/START68C/problems/MAKEAP
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int testCases;
    int num1;
    int num2;
    int difference;
    StringBuilder result = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    testCases = scanner.nextInt();
    while (testCases-- != 0) {
      num1 = scanner.nextInt();
      num2 = scanner.nextInt();
      difference = num2 - num1;
      result.append((num1 == num2 || (difference % 2 == 0)) ? num1 + difference / 2 : -1);
      result.append(testCases > 0 ? "\n" : "");
    }
    System.out.print(result);
    scanner.close();
  }
}