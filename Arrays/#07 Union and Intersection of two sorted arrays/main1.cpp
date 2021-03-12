#include <ostream>
#include <bits/stdc++.h>
using namespace std;

bool binarySearch(int a[], int n, int key)
{
    int low = 0;
    int high = n - 1;

    while (low <= high)
    {
        int mid = (high + low) / 2;

        if (a[mid] == key)
            return true;

        if (a[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return false;
}

int findIntersection(int a[], int b[], int a_len, int b_len)
{
    int int_count = 0;
    if (a_len > b_len)
    {
        int *temp_arr = a;
        a = b;
        b = temp_arr;

        // swap size
        int temp_size = a_len;
        a_len = b_len;
        b_len = temp_size;
    }

    sort(a, a + a_len);

    for (int i = 0; i < b_len; i++)
    {
        if (binarySearch(a, a_len, b[i]) == 1)
        {
            cout << b[i] << " ";
            int_count++;
        }
    }
    return int_count;
}

int findUnion(int a[], int b[], int a_len, int b_len)
{
    // before finding Union, will make one array samaller
    int union_count = 0;
    if (a_len > b_len)
    {
        int *temp_arr = a;
        a = b;
        b = temp_arr;

        // swap size
        int temp_size = a_len;
        a_len = b_len;
        b_len = temp_size;
    }

    sort(a, a + a_len);

    for (int i = 0; i < a_len; i++)
    {
        cout << a[i] << " ";
        union_count++;
    }

    for (int i = 0; i < b_len; i++)
    {
        if (!binarySearch(a, a_len, b[i]))
        {
            cout << b[i] << " ";
            union_count++;
        }
    }
    return union_count;
}

int main()
{

    int a[] = {1, 1, 2, 2, 3, 3};
    int b[] = {8, 9, 7, 6, 5};

    int a_len = sizeof(a) / sizeof(a[0]);
    int b_len = sizeof(b) / sizeof(b[0]);

    // cout << binarySearch(a, a_len, 1);

    int union_count = findUnion(a, b, a_len, b_len);
    cout << endl;
    int intersection_count = findIntersection(a, b, a_len, b_len);
    cout << endl;
    cout << union_count << " " << intersection_count;
    return 0;
}

/*
arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 

*/