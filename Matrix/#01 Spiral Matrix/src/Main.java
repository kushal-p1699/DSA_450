import java.util.Scanner;

public class Main {

    static void TraverseTop(int[][] arr, int s, int e){
        // s=0, e=3
        for(int i=s; i<=e; i++){
            System.out.print(arr[s][i]+" ");
        }
    }

    static void TraverseRight(int[][] arr, int s, int e){
        // s=1, e=3
        for(int i=s; i<=e; i++){
            System.out.print(arr[i][e]+" ");
        }
    }

    static void TraverseBottom(int[][] arr, int s, int e){
        // s=2, e=0
        for(int i=s; i>=e; i--){
            System.out.print(arr[s+1][i]+" ");
        }
    }

    static void TraverseLeft(int[][] arr, int s, int e){
        // s=2, e=1
        for(int i=s; i>=e; i--){
            System.out.print(arr[i][e-1]+" ");
        }
    }

    static void SpiralTraverse(int arr[][], int n){
        int s = 0, e = n-1;
        while(s < e){
            TraverseTop(arr, s, e);
            TraverseRight(arr, s+1, e);
            TraverseBottom(arr, e-1, s);
            TraverseLeft(arr, e-1, s+1);
            s++;
            e--;
        }

        /**
            if matrix size is odd*odd, then above code will not print middle number
            So, print the middle number if the n is odd
         **/
        if(n % 2 != 0){
            int mid_index = n/2;
            System.out.print(arr[mid_index][mid_index]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = in.nextInt();

        SpiralTraverse(arr, arr.length);
    }
}

/*
input 1:

5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

output:
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13

input 2:

4
1 2 3 4
5 6 7 8
9 10 11 12
13 4 15 16

output:
1 2 3 4 8 12 16 15 4 13 9 5 6 7 11 10



 */