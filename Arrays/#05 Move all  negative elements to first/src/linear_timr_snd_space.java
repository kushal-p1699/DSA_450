import java.util.Arrays;
// time : O(n)
// space : O(n)
public class linear_timr_snd_space {
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;

        // will use auxiliary array to store -ve and +ve values
        int temp[] = new int[n];
        int j = 0;
        // store -ve elements
        for(int i=0; i<n; i++)
            if(arr[i] < 0)
                temp[j++] = arr[i];

        //if all elements are -ve then j will be equal to n
        //if all elements are +ve then j will be equal to 0
        if(j == 0 || j == n)
            return;

        // store +ve value
        for(int i=0; i<n; i++)
            if(arr[i] >= 0)
                temp[j++] = arr[i];

        // copying values back to original arrays
        arr = temp;

        System.out.println(Arrays.toString(arr));
    }
}
