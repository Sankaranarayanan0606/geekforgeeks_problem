import java.util.Arrays;

public class ConvertArrayIntoZigZagFashion {

    public static void main(String[] args) {

        int arr[] = {4, 7, 3, 8, 2};
        zigZag(arr);
    }

    public static void zigZag(int[] arr) {
        // code here
        int len = arr.length;
        boolean flag = true;

        for(int i = 0; i < len - 1; i++)
        {
            if(flag)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            else {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            flag = !flag;
        }

        System.out.println(Arrays.toString(arr));
    }
}

