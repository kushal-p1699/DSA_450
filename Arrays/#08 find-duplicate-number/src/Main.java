import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int arr[] = {1,3,4,2,2};

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.contains(num)) {
                System.out.println(num);
                break;
            }

            set.add(num);
        }
    }
}
