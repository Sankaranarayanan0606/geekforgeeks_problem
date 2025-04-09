public class Numberofoccurrence {
    public static void main(String[] args) {
        int arr[] = {8 , 9 ,10, 12 ,12 ,12};
        System.out.println(countFreq(arr, 12));
    }
    public static int countFreq(int[] arr, int target) {

        // int left  = 0;
        // int right = arr.length - 1;
        // int start = 0, end = 0;

        // while(left <= right)
        // {
        //     int mid  = left + (right - left) / 2;

        //     if(arr[mid] == target && arr[mid -1] != target)
        //     {
        //         start = mid;
        //     }
        //     if(arr[mid] < target)
        //     {
        //         left  = mid + 1;
        //     }
        //     else
        //         right = mid - 1;

        // }



       
        //         return 0;


                int n = arr.length;
                int l = 0, r = n - 1;
                int lb = -1;
        
                // Finding the first occurrence (lower bound) of target
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (arr[mid] < target) {
                        l = mid + 1;
                    } else {
                        lb = mid;
                        r = mid - 1;
                    }
                }
        
                // If the element is not present in the array
                if (lb == -1 || arr[lb] != target) return 0;
        
                l = 0;
                r = n - 1;
                int ub = -1;
        
                // Finding the last occurrence (upper bound) of k
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (arr[mid] <= target) {
                        ub = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
        
                // Return the count of occurrences
                return ub - lb + 1;
    }
}
