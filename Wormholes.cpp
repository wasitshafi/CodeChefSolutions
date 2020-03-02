// Q: https://www.codechef.com/ZCOPRAC/problems/ZCO12002
#include<bits/stdc++.h>
using namespace std;
#define SIZE 1000000
int main()
{
    bool arrV[SIZE+1];
    bool arrW[SIZE+1];
    pair<int, int> p;
    vector<pair<int, int>> time;
    int n, x, y, s, e, j, item, min = INT_MAX, minV = INT_MAX, maxW = INT_MIN;
    
    for(int i = 0 ; i <= SIZE ; i++) arrV[i] = false;
    for(int i = 0 ; i <= SIZE ; i++) arrW[i] = false;
 
    cin >> n >> x >> y;
    for(int i = 0 ; i < n ; i++)
    {
        cin >> p.first >> p.second;
        time.push_back(p);
    }
    for(int i = 0 ; i < x ; i++)
    {
        cin >> item;
        arrV[item] = true;
        if(item < minV) minV = item;
    }
    for(int i = 0 ; i < y ; i++)
    {
        cin >> item;
        arrW[item] = true;
        if(item > maxW) maxW = item;
    }    
    for(int i = 0 ; i < n ; i++)
    {    
        if(minV > time[i].first || maxW < time[i].second) continue;
        if(arrV[time[i].first])
            s = time[i].first;
        else
        {        
            j = time[i].first-1;
            while(!arrV[j])j--;
            s = j;
        }
        if(arrW[time[i].second])
            e = time[i].second;
        else
        {       
            j =time[i].second+1;
            while(!arrW[j])j++;
            e = j;
        }
        if(e - s + 1 < min) min = e - s + 1;
    }
    cout << min;
    return 0;    
}