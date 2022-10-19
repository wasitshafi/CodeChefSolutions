
/**
 * @author WasitShafi
 * @since 18-OCT-22
 */
// Question: https://www.codechef.com/submit/ALTARAY
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws java.lang.Exception {
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);
    int noOfTestCases = scanner.nextInt();

    while (noOfTestCases-- != 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      int i = 0;
      while (i < n) {
        int count = 1;
        int j = i;
        while (j < n - 1 && ((arr[j] < 0 && arr[j + 1] > 0) || (arr[j] > 0 && arr[j + 1] < 0))) {
          count++;
          j++;
        }
        while (count != 0) {
          output.append(count + " ");
          count--;
          i++;
        }
      }
      output.append("\n");
    }
    System.out.print(output);
    scanner.close();
  }
}