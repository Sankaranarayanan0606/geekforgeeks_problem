public class adjecent {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        boolean temp = false;
        int len = arr.length;

        if(arr.length < 0)
           System.out.println();
        for(int i = 0; i < len - 1; i++)
        {
            if(arr[i] < arr[i + 1] )
                continue;
            else
            {
                temp = true;
                System.out.println(arr[i]);
                break;
            }
               
        }

        if(arr[len - 2] < arr[len -1] & temp == false)
            System.out.println(arr[len - 1]);
        
    }
}
