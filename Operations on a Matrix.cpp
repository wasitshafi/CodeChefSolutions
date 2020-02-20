#include <iostream>
using namespace std;

int main() {
    int noOfTestCases;
    int rows,  cols, queries, r, c;
    cin >> noOfTestCases;
    
    while(noOfTestCases--)
    {
        cin >> rows >> cols >> queries;
         
        int matrix[rows][cols];
        
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                matrix[i][j] = 0;
            }
        }
        
        while(queries--)
        {
            cin >> r >> c;
            
            // +1 to rows
            for(int i = 0 ; i < cols ; i++) matrix[r - 1][i]++;
            // +1 to cols
            for(int i = 0 ; i < rows ; i++) matrix[i][c - 1]++;
        }
        int count = 0;
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                if(matrix[i][j] % 2 != 0) count++; 
            }
        }
        cout << count << endl;
    }
	return 0;
}