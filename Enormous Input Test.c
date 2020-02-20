// Q : https://www.codechef.com/problems/INTEST/
#include <stdio.h>

int main()
{
    int n, k, num, count;
	
	scanf("%d %d", &n, &k);
	while(n--){ scanf("%d", &num); if (!(num % k)) count++; }
	printf("%d\n", count);
	
	return 0;
}