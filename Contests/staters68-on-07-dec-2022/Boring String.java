
/**
 * @author WasitShafi
 * @since 07-DEC-2022
 */
// Question: https://www.codechef.com/START68C/problems/BORSTR
// P.S : wasn't able to submit in contest (may get tle, not sure of it as of now)
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    int noOfTestCases;
    int N;
    StringBuilder result = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> sameStrings = new HashMap<String, Integer>();

    noOfTestCases = scanner.nextInt();
    while (noOfTestCases-- != 0) {
      N = scanner.nextInt();
      String str = scanner.next();

      // traverse all possible sub-strings
      for (int i = 0; i < N; i++) {
        for (int j = i; j < N; j++) {
          String tempStr = str.substring(i, j + 1);
          Boolean allSameCharacter = true;

          // check if all same chars
          for (int k = 1; k < tempStr.length(); k++) {
            if (tempStr.charAt(k - 1) != tempStr.charAt(k)) {
              allSameCharacter = false;
              break;
            }
          }
          if (allSameCharacter == true) {
            sameStrings.put(tempStr, sameStrings.getOrDefault(tempStr, 0) + 1);
          }
        }
      }
      // find the max-substring which has occurred more than once
      int max = 0;
      int maxSingleCharacter = 0;
      for (Map.Entry<String, Integer> mapEntry : sameStrings.entrySet()) {
        String key = mapEntry.getKey();
        Integer value = mapEntry.getValue();

        if (key.length() > 1 && value >= 2 && key.length() > max) {
          max = key.length();
        }
        // keep max for single chars as well
        if (key.length() == 1 && value >= 2 && value > maxSingleCharacter) {
          maxSingleCharacter = 1; // length of string
        }
      }
      result.append(max != 0 ? max : maxSingleCharacter);
      result.append(noOfTestCases > 0 ? "\n" : "");
      sameStrings.clear();
    }
    System.out.print(result);
    scanner.close();
  }
}
