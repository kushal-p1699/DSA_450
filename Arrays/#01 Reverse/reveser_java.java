import java.util.*;

class reverse_java {

    // iterative approach
    static void itertaive_reverse(int a[], int start, int end) {
        while(start <= end) {
            // swap numbers
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            // inrement start, decrement end
            start++;
            end--;
        }
    }

    // recursive approach
    static void recursive_reverse(int a[], int start, int end) {
        if(start >= end)
            return;
        // swap numbers
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        recursive_reverse(a, start+1, end-1);

    }

    // display array
    static void display(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};

        // iterative approach
        itertaive_reverse(a, 0, a.length-1);
        display(a, a.length);

        // recursive approch
        recursive_reverse(a, 0, a.length-1);
        display(a, a.length);

    }
}