import java.util.Arrays;

public class MoveAllZeroestoEnd {

    public static void main(String[] args) {
        
        int arr[] = {0,0,0,3,1,4};
        pushZerosToEnd(arr);
    }

    static void pushZerosToEnd(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            if(arr[start] != 0 && arr[end] == 0)
            {
                start++;
            }
            else if(arr[start] == 0 && arr[end] == 0)
            {
                end--;
            }
            else if(arr[start] == 0 && arr[end] != 0)
            {
                arr[start] = arr[end];
                arr[end] = 0;
                start++;
                end--;
            }
            else
                start++;
        }
        System.out.println(Arrays.toString(arr));
        // int position = 0;
        // for(int i = 0; i < arr.length - 1; i++)
        // {
        //     if((arr[i] == 0 && arr[i + 1] != 0) && (arr[position] == 0 && arr[i + 1] != 0) )
        //     {
        //             arr[position] = arr[i + 1];
        //             arr[i + 1] = 0;
        //             position = i + 1;
               
        //     }
        //     else if(arr[i] == 0 && arr[i + 1] != 0)
        //     {
        //         arr[i] = arr[i + 1];
        //         arr[i + 1] = 0;
        //         position = i + 1;
        //     }
        //     // else if(arr[i] == 0 && arr[i + 1] == 0)
        //     // {
        //     //     position = i;
        //     // }
        // }
        // System.out.println(Arrays.toString(arr));

//author code
        int n = arr.length;
        int nonZeroIndex =0;
        for(int i=0;i<n;i++)
        {
            
                if(arr[i]!=0){
                   int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                    nonZeroIndex++;
                }
        }
    }
    
}
