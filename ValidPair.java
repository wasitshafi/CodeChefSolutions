/**
 * @author WasitShafi
 * @since 17-Apr-2021
 */

import java.util.Scanner;

public class ValidPair {
  public static void main(String[] args) {
    int colorOne;
    int colorTwo;
    int colorThree;
    String ans;
    Scanner scanner = new Scanner(System.in);

    colorOne = scanner.nextInt();
    colorTwo = scanner.nextInt();
    colorThree = scanner.nextInt();
    ans = (colorOne == colorTwo) || (colorOne == colorThree) ||
      (colorTwo == colorThree) ? "YES" : "NO";
    System.out.print(ans);
    scanner.close();
  }
}