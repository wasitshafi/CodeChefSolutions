
// URL: https://www.codechef.com/JAN21C/problems/DECODEIT
/**
 * @author WasitShafi
 * @since 03-JAN-2021
 */
import java.util.Scanner;

class Codechef {
  public static char decodeChar(String c) {
    return (char) ('a' + Integer.parseInt(c, 2));
  }

  public static String decodeString(int n, String s) {
    StringBuilder decodedString = new StringBuilder("");

    for (int i = 0; i < n; i = i + 4) {
      decodedString.append(decodeChar(s.substring(i, i + 4)));
    }
    return decodedString.toString();
  }

  public static void main(String[] args) {
    int t;
    int n;
    String s;
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");

    t = scanner.nextInt();
    while (t-- != 0) {
      n = scanner.nextInt();
      s = scanner.next();
      output.append(decodeString(n, s));
      if (t != 0) {
        output.append("\n");
      }
    }
    System.out.print(output);
    scanner.close();
  }
}
