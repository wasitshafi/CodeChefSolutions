
       if(arr[i] == 1)
                count = i;
            else
            { if(arr[i] == 1)
                count = i;
            else
            {  for(int i = 1 ; i < size ; i++)
        {
            count = 0;;
            if(arr[i] == 1)
                count = i;
            else
            {
                for(int j = 0 ; j < i ; j++)
                    if(!(arr[j] % arr[i]))
                        count++;
            }            if(arr[i] == 1)
                count = i;
            else
            {
                for(int j = 0 ; j < i ; j++)
                    if(!(arr[j] % arr[i]))
                        count++;
            }            if(arr[i] == 1)
                count = i;
            else
            {
                for(int j = 0 ; j < i ; j++)
                    if(!(arr[j] % arr[i]))
                        count++;
            }            if(arr[i] == 1)
                count = i;
            else
            {
                for(int j = 0 ; j < i ; j++)
                    if(!(arr[j] % arr[i]))
                        count++;
            }            if(arr[i] == 1)
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