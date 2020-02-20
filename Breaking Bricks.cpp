//Q : https://www.codechef.com/JAN20B/problems/BRKBKS/
#include<iostream>
#include<vector>
#include<numeric> // for accumulate()

using namespace std;

int main()
{
    int n, s, w;
    vector<int> v;
    
    cin >> n;
    while(n--)
    {
        cin >> s;
        
        cin >> w;
        v.push_back(w);
        cin >> w;
        v.push_back(w);
        cin >> w;
        v.push_back(w);
     
        if(accumulate(v.begin(), v.end(), 0) <= s) // CTM : s <= w;
            cout << 1 << endl;
        else if(v[0] == v[2]) // first and last are same
        {
            if( v[0] + v[1] <= s)
                cout << 2 << endl;
            else 
                cout << 3 << endl;
        }
        else if(v[0] > v[2]) // first is greater than last
        {
            if(v[0] + v[1] <= s)
                cout << 2 << endl;
            else if(v[1] + v[2] <= s)
                cout << 2 << endl;
            else 
                cout << 3 << endl;
        }
        else if( v[2] > v[0])
        {
            if( v[2] + v[1] <= s)
                cout << 2 << endl;
            else if(v[0] + v[1] <= s)
                cout << 2 << endl;
            else
                cout << 3 << endl;
        }
        v.clear();
    }
	return 0;
}