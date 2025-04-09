public class FirstandSecondSmallests {
    public static void main(String[] args) {
        
        int arr[] = {3, 4, 2, 5, 6};
        System.out.println( result(arr));  
    }

    public static int[] result(int arr[])
    {
        int len = arr.length;
        int small =Integer.MAX_VALUE, secsmall= Integer.MAX_VALUE;


        for(int i = 0; i < len; i++)
        {
            if(arr[i] < small)
            {
                secsmall = small;
                small = arr[i];

            }
            else if( arr[i] > small && arr[i] < secsmall )
            {
                secsmall = arr[i];
            }
        }
        if(secsmall == Integer.MAX_VALUE) 
            return new int[]{-1};
        
        return new int[]{small, secsmall}; 
    }
    
}
