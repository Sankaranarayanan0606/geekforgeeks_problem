import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubarray {
    
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 10, 10));
        System.out.println(lenOfLongIncSubArr(arr));
    }

    public static int lenOfLongIncSubArr(List<Integer> arr) {
        int count = 1;
        int len = arr.size();
        //int temp = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 1; i < len; i++)
        {
            if(arr.get(i) > arr.get(i - 1))
            {
                //temp = arr.get(i);
                count++;
            }
            else{
                //temp = Integer.MIN_VALUE;
                if(count > max)
                    max = count;

                count = 1;
            }
        }
        if(count > max )
            max = count;


        return max;
    }
}
