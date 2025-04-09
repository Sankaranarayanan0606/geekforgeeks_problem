import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeADistinctDigitArray {
    public static void main(String[] args) {
        
        int nums[] = {111, 222, 333, 4444, 666};
        System.out.println(Arrays.toString(common_digits(nums)));
    }

    public static int[] common_digits(int[] nums)
    {
        // int len = nums.length;

        // for(int i = 0; i < len; i++)
        // {
        //     digit(nums[i]);
        // }
        // return new int[]{};

        Set<Integer> set = new HashSet<>();
        int n;
        for(int i=0;i<nums.length;i++){
            n = nums[i];
            while(n!=0){
                set.add(n%10);
                n=n/10;
                
            }
        }
        int[] array = new int[set.size()];
        int i=0;
        for(Integer num:set){
                    array[i++] = num;

        }
        return array;
    }

    // private static int digit(int n)
    // {
    //     List<Integer> res = new ArrayList<>();

    //     while( n != 0)
    //     {
    //         int rem = n % 10;
    //         if(res.contains(rem))
    //             continue;
    //         else 
    //             res.add(rem);

    //         n = n /10;
    //     }

    //     return 0;
    // }
}
