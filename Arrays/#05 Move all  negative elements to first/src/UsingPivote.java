import java.util.Arrays;

public class UsingPivote {

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = a.length;

        int l = 0, h = n-1;
        while(l < h){
            while (a[l] < 0 && l < h) l++;
            while (a[h] > 0 && l < h) h--;
            swap(a, l, h);
            // after swapping increment l, and decrement h
            l++;
            h--;

        }
        System.out.println(Arrays.toString(a));
    }
}

/* logic:

    set l = 0 and h = n-1;
    while( l < h){
        increment l until a[l] is positive
        decrement h until a[h] is negative

        swap(a[l], a[h])
    }

    Time : O(n)
    Space : O(1)
    problem is array element will lose the order
 */