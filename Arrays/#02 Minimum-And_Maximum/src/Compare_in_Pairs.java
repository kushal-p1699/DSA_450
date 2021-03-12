public class Compare_in_Pairs {
    private static class Pair {
        private int min;
        private int max;
    }

    static Pair get_min_max(int a[], int n) {
        Pair p = new Pair();
        int i = 0;
        // if array as even number of elements, then
        // initialize first two elements as min and max;
        if(n % 2 == 0) {
            if(a[0] > a[1]){
                p.max = a[0];
                p.min = a[1];
            }else {
                p.max = a[1];
                p.min = a[0];
            }

            i = 2;
        }
        // if odd then, initialize first element as both min and max
        else {
            p.max = a[0];
            p.min = a[0];
            i = 1;
        }

        // loop from i to n and compare in pairs;
        for( ; i < n-1; i+=2) {
            if(a[i] > a[i+1]) {
                if(a[i] > p.max) p.max = a[i];
                if(a[i+1] < p.min) p.min = a[i+1];
            }else {
                if(a[i+1] > p.max) p.max = a[i+1];
                if(a[i] < p.min) p.min = a[i];
            }
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
