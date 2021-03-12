import java.util.Arrays;

public class RGBMethod {

    static void sort(int a[], int n) {
        int low = 0, mid = 0, high = n-1;
        while(mid <= high) {
            switch (a[mid]) {
                case 0 : if(low != mid)   // if both pointer pointing to same element, why you want to swap??
                            swap(a, low, mid);
                         low++;
                         mid++;
                         break;

                case 1: mid++;
                        break;

                case 2: swap(a, mid, high);
                        high--;
                        break;
            }
        }
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,0,2,1,1,0,2,1,1,0};
        int n = arr.length;

        sort(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}


/*
logic:
1)point low and mid to starting element and high to last element
2)traverse mid
  if mid is pointing to 0, then swap low and mid, and increment both
  if mid is pointing to 1, then just increment mid.
  if mid is pointing to 2, then swap mid and high, and decrement high ( do not increment mid, we need to compare again)

3) print resultant array

 */