import java.util.Arrays;

// order of elements is not maintained

public class Main {

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = a.length;

        int x = 0, y = 0;
        while(y < n) {
            if(a[y] < 0){   // negative
                if(x != y)
                    swap(a, x, y);
                x++;
                y++;
            }else if(a[y] >= 0) {
                y++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
