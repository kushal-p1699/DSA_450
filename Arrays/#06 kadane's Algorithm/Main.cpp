#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int maxSubArraySum(int a[], int n)
{

    /*

     // use this to include negative max sum
        int max_so_far = INT_MIN;
        int max_ending_here = 0;

        for(int i=0; i<n; i++) {
            max_ending_here += arr[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            if(max_ending_here < 0)
                max_ending_here = 0;

        }
        return max_so_far;
    */





    int max_so_far = 0;
    int max_ending_here = 0;

    for (int i = 0; i < n; i++)
    {
        max_ending_here += a[i];
        if (max_ending_here < 0)
            max_ending_here = 0;
        else if (max_so_far < max_ending_here)
            max_so_far = max_ending_here;
    }
    return max_so_far;
}

int main()
{
    int a[] = {1, 2, 3, -2, 5};
    int n = sizeof(a) / sizeof(a[0]);

    int res = maxSubArraySum(a, n);
    cout << res << endl;
}

/*
a[] = {1, 2, 3, -2, 5};

trace:
index         = 0 1 2 3 4
max_end_here  = 1 3 6 4 9
max_so_far    = 1 3 6 6 9

res = max_so_far = 9


*/