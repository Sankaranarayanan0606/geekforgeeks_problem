import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Leet Code:
public class TwoSum {
    public static void main(String[] args) {
    int num[] = {3, 3};
    System.out.println(Arrays.toString(twoSum(num, 6)));
        
    }

    public static int[] twoSum(int[] num, int target) {

        // int len = num.length;
        // int ans[] = new int[2];
        // for (int i = 0; i < len - 1; i++ )
        // {
        //     if(num[i]+ num[i + 1] == target)
        //     {
        //         ans[0] = i;
        //         ans[1] = i + 1;
        //     }
        // }

        //     return ans;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length; i++)
        {
            int cur = num[i];
            int x = target - cur;
            if(map.containsKey(x))
                return new int[]{map.get(x) , i};

            map.put(cur, i);
        }
        return new int[]{};
        
    }
}
