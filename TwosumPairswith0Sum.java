import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TwosumPairswith0Sum {
    public static void main(String[] args) {
        
        int arr[] = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5 };
        System.out.println(getPairs(arr));
    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Set<Integer> pair = new HashSet<>();
        int left = 0;
        int right  = arr.length - 1;
            while (left < right) {
                
                if(arr[left] + arr[right] == 0)
                {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[left]);
                    pair.add(arr[right]);
                    // pair.sort(null);
                    result.add(pair);
                    left++;
                    
                }
                else 
                {
                   // pair.clear();
                    right--;
                }
                    
            }

            return result;
        // code here

        // ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // int n = arr.length;
        // Arrays.sort(arr);
        // int left = 0;
        // int right = n - 1;
        // while (left < right) {
        //     int sum = arr[left] + arr[right];
        //     if (sum < 0) {
        //         left++;
        //     } else if (sum > 0) {
        //         right--;
        //     } else {
        //         ArrayList<Integer> triplet = new ArrayList<>();
        //         triplet.add(arr[left]);
        //         triplet.add(arr[right]);
        //         result.add(triplet);
        //         left++;
        //         right--;
        //         while (left < right && arr[left] == arr[left - 1]) {
        //             left++;
        //         }
        //         while (left < right && arr[right] == arr[right + 1]) {
        //             right--;
        //         }
        //     }
        // }
        // return result;
    }
}
