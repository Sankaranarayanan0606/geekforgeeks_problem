package Two_pointer_problem;

public class MinimumDistanceInAnArray {
    public static void main(String[] args) {
        int arr[] = { 5,3,1,8,3,23,2 };
        System.out.println(minDist(arr, 2, 5));
    }

    public static int minDist(int arr[], int x, int y) {


        int n = arr.length;
        int recent_x = -1;
        int recent_y = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                recent_x = i;

                // Checking both recent X and Y is found in the array or not
                if (recent_y != -1) ans = Math.min(Math.abs(recent_x - recent_y), ans);
            } else if (arr[i] == y) {
                recent_y = i;

                // Checking both recent X and Y is found in the array or not
                if (recent_x != -1) ans = Math.min(Math.abs(recent_x - recent_y), ans);
            }
        }

        // If ans is not updated then either x or y, or both are not present in
        // the array
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;

        // int start = 0;
        // int end = arr.length - 1;
        // int i = end;
        // int result[] = new int[2];

        // while (start <= i && end >= 0) {
        //     if (arr[start] == x && result[0] == 0) {
        //         result[0] = start + 1;
        //     } else if (arr[end] == y) {
        //         result[1] = end + 1;
        //         end--;
        //     } else if (result[0] == 0) {
        //         start++;
        //     } else {
        //         end--;
        //     }

        // }
        // if (result[0] == 0 || result[1] == 0)
        //     return -1;
        // int diff = result[1] - result[0];
        //     return diff < 0 ? -diff : diff;

        // return -1;
        // if( last !=0)
        // {
        // int difference = last - first;
        // return difference < 0 ? -difference : difference;

        // }

        // int result[]= new int[2];
        // for(int i = 0; i < arr.length; i++)
        // {
        // if(arr[i] == x && result[0] == 0)
        // {
        // result[0] = i;
        // }
        // else if(arr[i] == y && result[1] == 0)
        // {
        // result[1] = i;
        // }
        // }
        // int diff = result[1] - result[0];
        // if(diff != 0)
        // return diff < 0 ? -diff: diff;

    }

}
