
// 2 test cases got AC, 2 test case got TLE
// URL: https://www.codechef.com/START79D/problems/PRIMEFACT
/**
 * @author WasitShafi
 * @since 01-MAR-2023
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.google.common.math.IntMath;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    int T;
    int currentScore;
    int maxScoreLimit;
    int countSeconds;
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    T = scanner.nextInt();
    while (T-- != 0) {
      currentScore = scanner.nextInt();
      maxScoreLimit = scanner.nextInt();

      countSeconds = 0;
      while (currentScore < maxScoreLimit) {
        int smallestPrimeFactor = 2;

        // find smallest prime factor of currentScore
        while (!(currentScore % smallestPrimeFactor == 0 && IntMath.isPrime(smallestPrimeFactor))) {
          smallestPrimeFactor++;
        }
        currentScore += smallestPrimeFactor;
        countSeconds++;
      }
      output.append(countSeconds);
      if (T != 0) {
        output.append("\n");

      }
    }
    System.out.print(output);
    scanner.close();
  }
}
