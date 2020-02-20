//Q : https://www.codechef.com/OCT19B/problems/S10E
#include<iostream>
#include<vector>
using namespace std;

int main(void) {
    int noOfTestCases, n, count = 1, item;
    vector <int> arr;
    
    cin >> noOfTestCases;
    
    while(noOfTestCases--)
    {
        cin >> n;
        
        for(int i = 0 ; i < n ; i++)
        {
            cin >> item;
            arr.push_back(item);
        }
        
        for(int  i = 1 ; i < n ; i++)
        {
            bool allAreMinimum = true;
            for(int j = i - 1  ; j>= i - 5 ; j--)
            {
                if(arr[j] <= arr[i] && j >= 0) 
                {
                    allAreMinimum = false;
                    break;
                }
            }
            if(allAreMinimum) count++;
                
        }
        cout << count;
        if(noOfTestCases != 0) cout << endl;
        
        arr.clear();
        count = 1;
    }
	return 0;
}