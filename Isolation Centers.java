//https://www.codechef.com/MAY20B/problems/CORUS
/**
 * @author wasitshafi
 * @since 05-05-2020
 */
import java.util.Scanner;
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args)
	{
        String viruses = "";
        int arr[] = new int[26];
        int tc, n, query,c , pendingQueue;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        
        tc = scan.nextInt();
        while(tc-- != 0)
        {
            n = scan.nextInt();
            query = scan.nextInt();
            viruses = scan.next();
            
            for(int j = 0 ; j  < query ; j++)
            {
                c = scan.nextInt();
                Arrays.fill(arr, c);
                for(int i = 0 ; i < n ; i++) arr[viruses.charAt(i) - 'a']--;
                pendingQueue = 0;
                for(int i = 0 ; i < 26 ; i++) if(arr[i] < 0) pendingQueue += -arr[i];
                output.append(pendingQueue + "\n");
            }
        }
        System.out.print(output);
        scan.close();
	}
}