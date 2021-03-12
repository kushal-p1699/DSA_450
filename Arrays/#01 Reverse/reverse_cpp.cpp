#include <iostream>
using namespace std;

// reverse using iterative approch
void iterative_reverse(int a[], int start, int end)
{

    while (start <= end)
    {
        //swap numbers
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        // increment start, decrement start
        start++;
        end--;
    }
}

// reverse using recursive approch
void recursive_reverse(int a[], int start, int end)
{
    if (start >= end)
        return;

    // swap numbers
    int temp = a[start];
    a[start] = a[end];
    a[end] = temp;

    recursive_reverse(a, start + 1, end - 1);
}

// display array
void display(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
}

int main()
{

    int a[] = {1, 2, 3, 4, 5};
    int n = sizeof(a) / sizeof(a[0]);

    // reverse using iterative approch
    iterative_reverse(a, 0, n - 2);
    display(a, n);

    // reverse uding  recursive approch
    recursive_reverse(a, 0, n - 2);
    display(a, n);

    return 0;
}