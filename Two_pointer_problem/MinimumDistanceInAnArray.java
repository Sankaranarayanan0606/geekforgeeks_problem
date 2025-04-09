package Two_pointer_problem;

public class MinimumDistanceInAnArray {
    public static void main(String[] args) {
        int arr[] = { 5,3,1,8,3,23,2 };
        System.out.println(minDist(arr, 2, 5));
    }

    public static int minDist(int arr[], int x, int y) {

        int start = 0;
        int end = arr.length - 1;
        int i = end;
        int result[] = new int[2];

        while (start <= i && end >= 0) {
            if (arr[start] == x && result[0] == 0) {
                result[0] = start + 1;
            } else if (arr[end] == y) {
                result[1] = end + 1;
                end--;
            } else if (result[0] == 0) {
                start++;
            } else {
                end--;
            }

        }
        if (result[0] == 0 || result[1] == 0)
            return -1;
        int diff = result[1] - result[0];
            return diff < 0 ? -diff : diff;

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
