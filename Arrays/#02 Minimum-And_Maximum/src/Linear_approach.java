import java.util.*;

// this is a simple linear approach

public class Linear_approach {
    private static class Pair {
        private int min;
        private int max;
    }

    static Pair get_min_max(int a[], int n) {
        Pair p = new Pair();

        // if array has only one element, then return it as minimum and maximum
        if(n == 1) {
            p.min = a[0];
            p.max = a[0];
        }

        // if array has two elements, initialize min and max
        if(a[0] > a[1]) {
            p.max = a[0];
            p.min = a[1];
        }else{
            p.max = a[1];
            p.min = a[0];
        }

        // loop form 2 to n
        for(int i=2; i<n; i++) {
            if(a[i] > p.max) p.max = a[i];
            else if(a[i] < p.min) p.min = a[i];
        }

        return p;
    }

    public static void main(String[] args) {
        int a[] = {20, 3, 24, 78, 40, 65, 15};
        int n = a.length;
        Pair min_max = get_min_max(a, n);
        System.out.println("Minimum is: "+min_max.min);
        System.out.println("Maximum is: "+min_max.max);
    }
}
