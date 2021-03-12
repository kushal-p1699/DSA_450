public class simple_approach {
    public static void main(String[] args) {
        int a[] = {20, 3, 24, 78, 40, 65, 15};
        int n = a.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: a) {
            if(num > max) max = num;
            if(num < min) min = num;
        }

        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }
}
