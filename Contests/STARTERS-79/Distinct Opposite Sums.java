
// URL: https://www.codechef.com/START79D/problems/DISTOPPSUMS
/**
 * @author WasitShafi
 * @since 01-MAR-2023
 */

import java.util.Scanner;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    int T;
    int N;
    StringBuilder output = new StringBuilder("");
    StringBuilder permutation = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    T = scanner.nextInt();
    while (T-- != 0) {
      N = scanner.nextInt();
      permutation.setLength(0);
      for (int i = N / 2; i > 0; i--) {
        permutation.append(i + " ");
      }
      for (int i = N / 2 + 1; i <= N; i++) {
        permutation.append(i + " ");
      }
      output.append(permutation.toString());

      if (T != 0) {
        output.append("\n");
      }

    }
    System.out.print(output);
    scanner.close();
  }
}
