import java.util.Arrays;

public class ImmediateSmallerElement {
    
    public static void main(String[] args) {
        
        int arr[] = {4, 5, 2, 1, 3};
        int len = arr.length;
        
        for(int i = 0; i < len - 1; i++)
        {
            if(arr[i + 1] < arr[i] )
            {
                arr[i] = arr[i + 1];
            }
            else
                arr[i] = -1;
        }
        arr[len - 1] = -1;
        System.out.println(Arrays.toString(arr));

        //optimized solution 

    }
}
