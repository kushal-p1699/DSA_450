import java.util.Arrays;

public class qucikSort_Normal {
    public int getKthSmallestElement(int arr[], int start, int end, int k) {
        // if k is smaller than no. of elements in array
        if(k > 0 && k <= end-start+1) {
            // partition the array around last element
            // and get position of pivot element in sorted array
            int pivot_pos = partition(arr, start, end);
            System.out.println(Arrays.toString(arr));
            // if pivot position is same as k
//            if(pivot_pos - start == k - 1)
//                return arr[pivot_pos];
//
//            if(pivot_pos - start > k - 1)
//                return getKthSmallestElement(arr, start, pivot_pos-1, k);
//
//            return getKthSmallestElement(arr, pivot_pos+1, end, k-pivot_pos+start-1);

        }

        return Integer.MAX_VALUE;
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;

        for(int j=start; j<=end-1; j++){
            if(arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
