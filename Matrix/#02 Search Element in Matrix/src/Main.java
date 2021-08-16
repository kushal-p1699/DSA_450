import java.util.Scanner;

public class Main {

    static boolean SearchMatrix(int arr[][], int r, int c, int key){
        int i=0;
        while(i <= r){
            if(key >= arr[i][0] && key <= arr[i][c]){
                for(int j=0; j<=c; j++){
                    if(arr[i][j] == key)
                        return true;
                }
                return false; // if key is not in the min and max range then return false;
            }else{
                i++;
            }
        }
        return false;
    }

    static boolean BinarySearch(int arr[][], int r, int c, int key){
        // Since the matrix is sorted, consider it as 1D array
        int start = 0;
        int end = (c * r) - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            int mid_value = arr[mid / c][mid % c]; // this line will give the mid value

            if(mid_value == key)
                return true;
            else if(mid_value < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();

        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = in.nextInt();
        int key = in.nextInt();

//        boolean found = SearchMatrix(arr, r-1, c-1, key);  // in worst case : O(r*c)
        boolean found = BinarySearch(arr, r, c, key);
        System.out.println(found);
    }
}

// SearchMatrix() runs in:
// best case: O(ColumnSize)
// worst case: O(RowSize * ColumnSize)

/*

input 1:

4 4
1 3 5 7
10 11 16 20
23 30 34 60
71 76 78 90
90

output:
true

input 2:

4 4
1 3 5 7
10 11 16 20
23 30 34 60
71 76 78 90
28

output:
false


 */