public class MissingNuminArray {
    
    public static void main(String[] args) {
        

    }

    static int missingNumber(int arr[]) {

        int n = arr.length + 1;
        
        long ans = 0;
        for( long  i : arr)
        {
            ans+=i;
        } 
        
        long sum = (long)n*(n+1) / 2;
        
        return (int)(sum - ans); 
    }
}
