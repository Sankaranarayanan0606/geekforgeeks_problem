import java.util.Arrays;

public class productArrayPuzzle {
    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 6, 2};
        // int result[] = productExceptSelf(arr);
        // for (int i : result) {
        //     System.out.print(i + " ");
        // }
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

//     public static int[] productExceptSelf(int arr[]) {

//         int len = arr.length;
//         int result[] = new int[len];

//         for(int i = 0; i < len; i++)
//         {
//             result[i] = product(arr, i);
//         }


//     return result;
// }

// private static int product(int arr[], int i)
// {
//     int product = 1;
//     for (int j = 0; j < arr.length; j++) {
//         if (j != i) {
//             product *= arr[j];
//         }
//     }
//     return product;
// }
}
