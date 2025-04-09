import java.util.ArrayList;

public class AbsoluteDifference {
    
    public static void main(String[] args) {
        int arr[] = {87, 89, 45, 235, 465, 765, 123, 987, 499, 655};
       
        System.out.println( getDigitDiff1AndLessK(arr, 1000));
    }

    public static ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int len  = arr.length;
        for(int i = 0; i < len - 1; i++)
        {
            if(arr[i] >= 10 )
                continue;
            else if(arr[i] < k)
            {
                ans.add(arr[i]);
            }
        }






            return ans;
        // code here
    }

    static boolean findAdj(int n)
    {

        while(n > 0)
        {

        }
        return false;
    }
}
