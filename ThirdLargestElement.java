import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestElement {

    public static void main(String[] args) {

        int arr[] = {5, 5, 5};
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(int[] arr) {

//        int len = arr.length;
//        if(len == 2) return  -1;
//        Arrays.sort(arr);
//
//        return arr[len - 3];

        // Your code here
        int len = arr.length;
        if(len == 2) return  -1;

        int firstlarge = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        int thirdlarge = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++)
        {
            if(arr[i] >= firstlarge)
            {
                thirdlarge = seclarge;
                seclarge = firstlarge;
                firstlarge = arr[i];
            }
            else if(arr[i] >= seclarge)
            {
                thirdlarge = seclarge;
                seclarge = arr[i];

            }
            else if(arr[i] >= thirdlarge)
                thirdlarge = arr[i];
        }
        return  thirdlarge;
    }
}
