import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static void FindFrequency(String str, int n){
        // storing frequency in freq array of size 26
        int freq[] = new int[26];

        for(char c: str.toCharArray()){
            freq[c - 97]++;  // Example: 'a' ASCII value is 97 So, a - 97 = 0, So freq[0] is incremented, and 'b' ASCII is 98 ... so on
        }

        // display
        for(int i=0; i<freq.length; i++){
            if(freq[i] >= 1){
                System.out.println("Count of "+((char) (i+97))+" is: "+freq[i]);
            }
        }
    }

    static void FindFreqUsingMap(String str, int n){
        Map<Character, Integer> freq = new HashMap<>();

        for(char c: str.toCharArray()){
            int count = (freq.containsKey(c)) ? freq.get(c) : 0;
            freq.put(c, count+1);
        }

        System.out.println(freq);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        FindFrequency(str, str.length());

        // finding frequency using Map
        FindFreqUsingMap(str, str.length());
    }
}
