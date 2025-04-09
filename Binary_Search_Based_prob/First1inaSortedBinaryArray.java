package Binary_Search_Based_prob;
public class First1inaSortedBinaryArray {
    public static void main(String[] args) {
        int arr[] = {0,1,1};
        System.out.println(firstIndex(arr));
    }
    
    public static long firstIndex(int arr[]) {
        // for(int i= 0; i < arr.length; i++){
        //     if(arr[i] == 1)
        //         return i;
        // }
        int x = 1;
        int start = 0, end = arr.length - 1;
        if(arr[0] == 1) return 0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid] == x && arr[mid - 1] != arr[mid])
                return mid;
            
            if(arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
