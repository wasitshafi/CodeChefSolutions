// URL : https://www.codechef.com/JAN21C/problems/DIVTHREE
/**
 * @author WasitShafi
 * @since 02-JAN-2021
 */
import java.math.BigInteger;
import java.util.Scanner;

class Codechef {
  public static String maximumNumberOfDivision3(int n, int k, int d, int[] arr){
    BigInteger sum = new BigInteger("0");

    for (int i = 0; i < n; i++)
    {
      sum = sum.add(BigInteger.valueOf(arr[i]));
    }

    BigInteger total = sum.divide(BigInteger.valueOf(k));
    if (sum.compareTo(BigInteger.valueOf(k)) < 0) {
        return 0 + "";
    } else if (total.compareTo(BigInteger.valueOf(d)) > 0) {
      return d + "";
    } else {
      return total + "";
    }
  }
  public static void main(String[] args) {
    int t;
    int n;
    int k;
    int d;
    int arr[];
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");
    t = scanner.nextInt();
    while (t-- != 0) {
      n = scanner.nextInt();
      k = scanner.nextInt();
      d = scanner.nextInt();
      arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      output.append(maximumNumberOfDivision3(n, k, d, arr));
      if (t != 0) {
        output.append("\n");
      }
    }

    System.out.println(output);
    scanner.close();
  }
}
