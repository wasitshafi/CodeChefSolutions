// URL : https://www.codechef.com/JAN21C/problems/DIVTHREE
/**
 * @author WasitShafi
 * @since 02-JAN-2021
 */
import java.util.Scanner;
import java.math.BigInteger;

class Codechef {
  public static String maximumNumberOfDivision3(int k, int d, BigInteger sum) {

    BigInteger max = sum.divide(BigInteger.valueOf(k));
    if (sum.compareTo(BigInteger.valueOf(k)) < 0) {
        return 0 + "";
    } else if (max.compareTo(BigInteger.valueOf(d)) > 0) {
      return d + "";
    } else {
      return max + "";
    }
  }

  public static void main(String[] args) {
    int t;
    int n;
    int k;
    int d;
    BigInteger sum = new BigInteger("0");
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");

    t = scanner.nextInt();
    while (t-- != 0) {
      n = scanner.nextInt();
      k = scanner.nextInt();
      d = scanner.nextInt();
      sum = BigInteger.valueOf(0);

      for (int i = 0; i < n; i++)
      {
        sum = sum.add(scanner.nextBigInteger());
      }

      output.append(maximumNumberOfDivision3(k, d, sum));
      if (t != 0) {
        output.append("\n");
      }
    }

    System.out.println(output);
    scanner.close();
  }
}
