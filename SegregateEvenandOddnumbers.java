import java.util.Arrays;

public class SegregateEvenandOddnumbers {

    public static void main(String[] args) {

        int arr[] = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);

    }

    static void segregateEvenOdd(int arr[]) {
        
        // int len = arr.length;
        // int even[] = new int[len];
        // int odd[] = new int[len];

        // for(int i = 0; i < len; i++)
        // {
        //     if(arr[i] % 2 == 0)
        //         even[i] = arr[i];
        //     else
        //         odd[i] = arr[i];
        // }
        // System.out.println(Arrays.toString(even));
        // System.out.println(Arrays.toString(odd));
        // Arrays.sort(even);
        // Arrays.sort(odd);

        // for(int i = 0; i < len + len - 2; i++)
        // {
        //     if()
        // }

        // code here
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                // Swap arr[start] and arr[end]
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (arr[start] % 2 == 0 && arr[end] % 2 != 0) {
                start++;
                end--;
            } else if (arr[start] % 2 == 0) {
                start++;
            } else {
                end--;
            }
        }

        // Sort the even part
        Arrays.sort(arr, 0, start);

        // Sort the odd part
        Arrays.sort(arr, start, n);
        System.out.println(Arrays.toString(arr));
    }
    

}
