import java.util.Arrays;
import java.util.Scanner;

/**
 * if row and column size is different use this logic
 **/
public class MatrixOfSize_AXB {

    static void SpiralTraverse(int arr[][], int r, int c) {
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        /* dir---> represents direction of traversal. dir = 0(top), 1(right), 2(bottom), 3(left) */
        int dir = 0; // Since we traverse to row first, dir is set to 0

        while (top <= bottom && left <= right){
            if(dir == 0){
                for (int i=left; i<=right; i++)
                    System.out.print(arr[top][i]+" ");
                top++;
            }else if(dir == 1){
                for (int i=top; i<=bottom; i++)
                    System.out.print(arr[i][right]+" ");
                right--;
            }else if(dir == 2){
                for(int i=right; i>=left; i--)
                    System.out.print(arr[bottom][i]+" ");
                bottom--;
            }else if(dir == 3){
                for(int i=bottom; i>=top; i--)
                    System.out.print(arr[i][left]+" ");
                left++;
            }
            dir = (dir + 1) % 4;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = in.nextInt();

        SpiralTraverse(arr, r, c);
    }
}

/**

 Logic:
            left            right
    top -->  1   2   3   4   5
             6   7   8   9   10
            11   12  13  14  15
 bottom --> 16   17  18  19  20

 do when(top <= bottom && left <= right):
    if (dir == top)
        for each i from left to right
            print(arr[top][i])
        top++
    else if(dir == right)
        for each i from top to bottom
            print(arr[i][right])
        right--
   else if(dir == bottom)
        for each i from right to left
            print(arr[bottom][i])
       bottom--
   else if(dir == right)
       for each i from bottom to top
            print(arr[i][left])
       left++

 **/

/*
input 1:

4 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20

output:
1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
--------------------------------------------------------
input 2:
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
--------------------------------------------------------
input 3:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

output:
1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10
--------------------------------------------------------
input 4:
3 5

6 6 2 28 2
12 26 3 28 7
22 25 3 4 23

output:
6 6 2 28 2 7 23 4 3 25 22 12 26 3 28

 */

