package Binary_Search_Based_prob;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int arr[]= {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
        System.out.println(transitionPoint(arr));
    }

    public static int transitionPoint(int arr[]) {

        int len = arr.length - 1;
        int start = 0;
        int end = len;
        if(arr[0] == 1) return 0;
        if(arr[len] == 0) return -1;

        while(start <= end)
        {
            int mid = (start+end) / 2 ;

            if(arr[mid] == 0 && arr[mid + 1] != 0 )
            {
                return mid + 1;
            }
            else if(arr[mid] == 1)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    
}
