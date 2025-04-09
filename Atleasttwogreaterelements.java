import java.util.Arrays;

public class Atleasttwogreaterelements {
    public static void main(String[] args) {
        long arr[] = {7, -2, 3, 4, 9, -1};
        System.out.println(Arrays.toString(findElements(arr)));
    }
    public static long[] findElements(long arr[]) {

        Arrays.sort(arr);
        int len = arr.length;
        long result[] = new long[len -2]; 

        for(int i = 0; i < arr.length - 2; i++){
            result[i] = arr[i];
        }
        return result;
    }
}
