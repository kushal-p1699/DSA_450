import java.util.Scanner;

public class count_method {

    static void sort(int a[], int n){
        int zeros, ones, twos;
        zeros = ones = twos = 0;

        for(int i=0; i<n; i++){
            if(a[i] == 0) zeros++;
            else if(a[i] == 1) ones++;
            else twos++;
        }

        for(int i=0; i<zeros; i++)
            System.out.print(0+" ");
        for(int i=0; i<ones; i++)
            System.out.print(1+" ");
        for(int i=0; i<twos; i++)
            System.out.print(2+" ");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i=0; i<n; i++)
                a[i] = in.nextInt();

            sort(a, n);
        }
    }
}

/*
2
5
0 2 1 2 0
3
0 1 0

0 0 1 2 2
0 0 1
 */