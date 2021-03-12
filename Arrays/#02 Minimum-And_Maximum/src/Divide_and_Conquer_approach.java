public class Divide_and_Conquer_approach {
    private static class Pair {
        private int min;
        private int max;
    }

    static Pair get_min_max(int a[], int low, int high) {
        Pair p = new Pair();
        Pair pl = new Pair();
        Pair pr = new Pair();

        // if there is one element
        if(low == high) {
            p.max = a[low];
            p.min = a[high];
            return p;
        }

        // if there are two elements
        if(high == low+1) {
            if(a[low] > a[high]) {
                p.max = a[low];
                p.min = a[high];
            }else{
                p.max = a[high];
                p.min = a[low];
            }
            return p;
        }

        // if there are more than two elements
        int mid = (low + high) / 2;
        pl = get_min_max(a, low, mid);
        pr = get_min_max(a, mid+1, high);

        // compare minimum of two parts
        if(pl.min < pr.max) {
            p.min = pl.min;
        }else{
            p.min = pr.min;
        }

        // compare maximum of two parts
        if(pl.max > pr.max) {
            p.max = pl.max;
        }else{
            p.max = pr.max;
        }

        return  p;
    }

    public static void main(String[] args) {
        int a[] = {20, 3, 24, 78, 40, 65, 15};
        int n = a.length;

        Pair min_max = get_min_max(a, 0, n-1);
        System.out.println("Minimum is: "+min_max.min);
        System.out.println("Maximum is: "+min_max.max);
    }
}

/*

logic :

if array-size is 1
    then return element as both max and min
else if array-size is 2
    then in one comparision initialize min and max
else
    find mid;
    do recursion for fun(arr, low, mid)
    do recursion for fun(arr, mid+1, high)
    find min and max in two half of array
    return min and max;


 */
