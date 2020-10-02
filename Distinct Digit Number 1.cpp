// Q : https://www.codechef.com/HCS12019/problems/SETH0006
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int l, r, x;
    bool atleastOneXfound = false;

    vector<bool> digits(10, false);

    cin >> l >> r;
    for(int i = l ; i <= r ; i++)
    {
      x = i;

      while(x)
      {
        if(digits[x % 10] == false)
          digits[x % 10] = true;
        else
          break;
        x = x / 10;
      }
      if(x == 0)
      {
        cout << i << " ";
        if(!atleastOneXfound)
        {
            atleastOneXfound = true;
            break;
        }
      }
      digits.assign(10, false); //reset digits
    }
    if(!atleastOneXfound)
      cout << "-1";
	  return 0;
}
