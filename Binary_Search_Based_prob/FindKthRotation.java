package Binary_Search_Based_prob;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKthRotation {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,4, 5, 1, 2));
        System.out.println(findKRotation(arr));
    }
    public static int findKRotation(List<Integer> arr) {

        // int start = 0;
        // int end  = arr.size() -1;

        // while(start < end)
        // {
        //     int mid  = (end - start) / 2;

        //      if(arr.get(mid) < arr.get(mid + 1) )
        //      {
        //         end = mid - 1;
        //      }
        //      if(arr.get(mid - 1) > arr.get(mid))
        //      {
        //         return mid;
        //      }
        //      if(arr.get(mid) > arr.get(mid + 1))
        //      {
        //         return start + 1;
        //      }
        // }







        // return 0;

        int ans=0,min = arr.get(0),n=arr.size();
        int low=0,high=(n-1);
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            if(arr.get(mid) < min)
            {
                min = arr.get(mid);
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
