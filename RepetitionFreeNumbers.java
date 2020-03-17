// Q : https://www.codechef.com/IARCSJUD/problems/REPFREE
// 9 outof 11 TC passed, 2 TLE
/**
 * @author wasitshafi
 * @since  14-03-20
 */
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

class RepetitionFreeNumbers
{
    public static Boolean isRepetitionFree(String s)
    {
        Boolean digits[] = new Boolean[10];
        Arrays.fill(digits, false);
        int len = s.length();
        for(int i = 0 ; i < len ; i++)
            if(s.charAt(i) == '0' || digits[s.charAt(i) - '0'] == true)
                return false;
            else
                digits[s.charAt(i) - '0'] = true;
        return true;
    }
    public static void main(String[] args)
	{
	    Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BigInteger n = new BigInteger(s);
        n = n.add(BigInteger.valueOf(1));
        while(isRepetitionFree(n.toString()) == false) n = n.add(BigInteger.valueOf(1));
        System.out.println(n);
	    scan.close();
	}
}