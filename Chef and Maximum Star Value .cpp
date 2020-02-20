#include<iostream>

using namespace std;

int main()
{
    int noOfTestCases, size, count, maxCount;
    
    cin >> noOfTestCases;
    
    while(noOfTestCases--)
    {
        
        cin >> size;
        int *arr = new int[size];

        for(int i = 0 ; i < size ; i++) cin >> arr[i];

        maxCount = 0;
        for(int i = 1 ; i < size ; i++)
        {
            count = 0;;
            if(arr[i] == 1)
                count = i;
            else
            {
                for(int j = 0 ; j < i ; j++)
                    if(!(arr[j] % arr[i]))
                        count++;
            }
            if(count > maxCount) maxCount = count;
        }
        cout << maxCount << endl;
    }
    return 0;
}