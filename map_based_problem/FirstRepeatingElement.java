package map_based_problem;
import java.util.HashMap;

public class FirstRepeatingElement {
    
    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr));
        
    }
    public static int firstRepeated(int[] arr) {
        // Map<Integer, Integer> map = new HashMap<>();
        // Map<Integer, Integer> times = new HashMap<>();

        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(!map.containsValue(arr[i]))
        //     {
        //         map.put(i + 1 , arr[i]);
        //     }
        //     else
        //     {
                
        //     }
        // }
        // System.out.println(map);
        // return -1;

//author solution
        HashMap<Integer, Integer> hp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(hp.containsKey(arr[i])){
                min = Math.min(min,hp.get(arr[i]));
            } else {
                hp.put(arr[i], i+1);
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;

//my soution
        // Map<Integer, Integer> hash=new HashMap<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(hash.get(arr[i])>1)
        //     {
        //         return i+1;
        //     }
        // }
        // return -1;


        //-------------------------------------------------------------------
        // int n = arr.length;
        // boolean flag = false;
        // int ans = -1;

        // // using map to store frequency of each element.
        // Map<Integer, Integer> m = new HashMap<>();

        // // storing the frequency of each element in map.
        // for (int i = 0; i < n; i++) {
        //     if (m.containsKey(arr[i])) {
        //         m.put(arr[i], m.get(arr[i]) + 1);
        //     } else {
        //         m.put(arr[i], 1);
        //     }
        // }

        // // iterating over the array elements.
        // for (int i = 0; i < n; i++) {
        //     // if frequency of current element in map is greater than 1,
        //     // then we store the index and break the loop.
        //     if (m.get(arr[i]) > 1) {
        //         ans = i + 1;
        //         break;
        //     }
        // }

        // // returning the position of the first repeating element.
        // return ans;

    }
}

