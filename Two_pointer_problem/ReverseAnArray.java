package Two_pointer_problem;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {


        int start= 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int temp =arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
