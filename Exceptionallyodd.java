public class Exceptionallyodd {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        int n = 7;
        System.out.println(getOddOccurrence(arr, n));
    }

    static int getOddOccurrence(int[] arr, int n) {
        int num = n -1;
        int ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[num] == arr[i])
                ans++;
        }
        if(ans%2 == 1)
            return arr[num];
        return -1;
    }
    
}
