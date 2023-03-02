
// URL: https://www.codechef.com/START79D/problems/BETDEAL
/**
 * @author WasitShafi
 * @since 01-MAR-2023
 */

import java.util.Scanner;

class Codechef {
  public static void main(String[] args) throws java.lang.Exception {
    final int STORE_A_PRODUCT_PRICE = 100;
    final int STORE_B_PRODUCT_PRICE = 200;
    int T;
    int storeADiscountPercentage;
    int storeBDiscountPercentage;
    double storeAProductPriceAfterDiscount;
    double storeBProductPriceAfterDiscount;
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");

    T = scanner.nextInt();
    while (T-- != 0) {
      storeADiscountPercentage = scanner.nextInt();
      storeBDiscountPercentage = scanner.nextInt();
      storeAProductPriceAfterDiscount = STORE_A_PRODUCT_PRICE
          - Math.round((STORE_A_PRODUCT_PRICE * (storeADiscountPercentage / 100.0)));
      storeBProductPriceAfterDiscount = STORE_B_PRODUCT_PRICE
          - Math.round((STORE_B_PRODUCT_PRICE * (storeBDiscountPercentage / 100.0)));

      output.append(storeAProductPriceAfterDiscount == storeBProductPriceAfterDiscount ? "BOTH"
          : storeAProductPriceAfterDiscount < storeBProductPriceAfterDiscount ? "FIRST" : "SECOND");
      if (T != 0) {
        output.append("\n");
      }
    }
    System.out.print(output);
    scanner.close();
  }
}
