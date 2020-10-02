//https://www.codechef.com/MAY20B/problems/COVID19
/**
 * @author wasit
 * @since 05-05-2020
 */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{	    
	    int tc, n, arr[], min, max, count;
	    Scanner scan = new Scanner(System.in);
	    StringBuilder output = new StringBuilder("");
	    
	    tc = scan.nextInt();
	    while(tc-- != 0)
	    {
	        n = scan.nextInt();
	        arr = new int[n];
	        for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
	         
	        //Min
	        count = 1;
	        min = -1;
	        for(int i = 1 ; i < n ; i++)
	        {
	            if(arr[i] - arr[i-1] <= 2)
	                count++;
	            else if(min == -1)
	            {
	                min = count;
	                count = 1;
	            }
	            else if(count < min)
	            {
	                min = count;
	                count = 1;
	            }
	            else
	                count = 1;
	        }
	        if(min == -1 || count < min) min = count;
	        
	        // Max
	        count = 1;
	        max = -1;
	        for(int i = 1 ; i < n ; i++)
	        {
	            if(arr[i] - arr[i-1] <= 2)
	                count++;
	            else if(max == -1)
	            {
	                max = count;
	                count = 1;
	            }
	            else if(count > max)
	            {
	                max = count;
	                count = 1;
	            }
	            else 
	                count = 1;
	   	   }
	       if(max == -1 || count > max) max = count;
           output.append(min + " " + max + "\n");   
	    }
	    System.out.println(output);
        scan.close();
    }
}