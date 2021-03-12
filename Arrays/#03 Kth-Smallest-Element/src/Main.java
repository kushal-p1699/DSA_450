public class Main {
    public static void main(String[] args) {
        qucikSort_Normal obj = new qucikSort_Normal();
        int arr[] = {12, 3, 5, 7, 4, 19, 26, 1, 2};
        int k = 3;
        int kth_samllest = obj.getKthSmallestElement(arr, 0, arr.length-1, k);
        System.out.println(kth_samllest);
    }
}
