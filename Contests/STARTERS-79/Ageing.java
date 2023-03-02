
// URL: https://www.codechef.com/START79D/problems/AGEING
/**
 * @author WasitShafi
 * @since 01-MAR-2023
 */

import java.util.Scanner;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    int T;
    final int AGE_DIFFERENCE = 10;
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    T = scanner.nextInt();
    while (T-- != 0) {
      output.append(scanner.nextInt() - AGE_DIFFERENCE);
      if (T != 0) {
        output.append("\n");

      }
    }
    System.out.print(output);
    scanner.close();
  }
}
