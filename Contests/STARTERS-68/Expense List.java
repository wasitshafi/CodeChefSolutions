
/**
 * @author WasitShafi
 * @since 07-DEC-2022
 */
// Question: https://www.codechef.com/START68C/problems/EXPENSES
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int noOfTestCases;
    int N;
    int X;
    StringBuilder result = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    noOfTestCases = scanner.nextInt();
    while (noOfTestCases-- != 0) {
      N = scanner.nextInt();
      X = scanner.nextInt();
      // GP -> An = a * r ^ n ie An = FIRST_TERM * COMMON_RATIO ^ n
      result.append((int) (Math.pow(2, X) / 2 * Math.pow(.5, N - 1)));
      result.append(noOfTestCases > 0 ? "\n" : "");
    }
    System.out.print(result);
    scanner.close();
  }
}