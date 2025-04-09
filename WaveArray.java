import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
         int arr[] = {1, 2};
         convertToWave(arr);

    }
    public static void convertToWave(int[] arr) {
        
        int len = arr.length;

        for(int i = 0; i < len -1;i = i+2)
        {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
