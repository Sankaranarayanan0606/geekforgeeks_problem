package Sliding_window;

public class SmallestSubarrayWithSumGreaterThanX {

    public static void main(String[] args) {

        int x = 51;
        int[] arr = {1, 4, 45, 6, 0, 19};

        System.out.println(smallestSubWithSum(x, arr));

    }

    public static int smallestSubWithSum(int x, int[] arr) {
        int sum = 0;
        int start = 0;
        int end  = 0;
        int min_len = 0;
        int len = arr.length;

        while (end <= len && start < len)
        {
            if(sum > x)
            {
                min_len = end - start + 1;
                sum-=arr[start];
                start++;
                //end--;
            }
            else if (sum <= x)
            {
                //min_len = end - start + 1;
                sum+=arr[end];
                end++;
            }
        }
        return  min_len;
    }
}
