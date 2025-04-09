import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reversesubarray {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 6, 7, 4));

        int l = 1;
        int r = 4;

        System.out.println(reverseSubArray((ArrayList<Integer>) arr, l, r));
    }

    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,int r) {

        int start = l - 1;
        int end = r -1;

        while (start < end) {

            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
            
        }

    
            return arr;
        
    }
    
}
