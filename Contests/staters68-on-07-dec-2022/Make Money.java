
/**
 * @author WasitShafi
 * @since 07-DEC-2022
 */
// Question:https://www.codechef.com/START68C/problems/MAKEMONEY
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int noOfTestCases;
    int N;
    int X;
    int cost;
    int coin;
    int coinsSum;
    int increaseCoinsCount;
    StringBuilder result = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    noOfTestCases = scanner.nextInt();
    while (noOfTestCases-- != 0) {
      N = scanner.nextInt();
      X = scanner.nextInt();
      cost = scanner.nextInt();
      coinsSum = 0;
      increaseCoinsCount = 0;

      for (int i = 0; i < N; i++) {
        coin = scanner.nextInt();
        if (X - coin > cost) {
          coin = X;
          increaseCoinsCount++;
        }
        coinsSum += coin;
      }
      result.append(coinsSum - cost * increaseCoinsCount);
      result.append(noOfTestCases > 0 ? "\n" : "");
    }
    System.out.print(result);
    scanner.close();
  }
}
