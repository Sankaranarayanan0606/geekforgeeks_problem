import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequenciesinaLimitedArray {
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        System.out.println(frequencyCount(arr));

    }
    public static List<Integer> frequencyCount(int[] arr) {
        //original answer:
         int n = arr.length;
        List<Integer> result = new ArrayList<>(
            Collections.nCopies(n, 0)); // Initialize the result list with 0s
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) { // Only count numbers between 1 and n
                result.set(arr[i] - 1, result.get(arr[i] - 1) + 1);
            }
        }
        return result;

    }
}
//my answer
// TreeMap<Integer , Integer> map = new TreeMap<>();
//         int x =1;
//         for(int i=0;i<arr.length;i++){
//             int key = arr[i];
//             int value = map.getOrDefault(key,0)+1;
//             map.put(key,value);
            
//             if(!map.containsKey(x))
//                 map.put(x,0);
            
//             x++;
//         }
        
//         List<Integer> ll = new ArrayList<>(map.values());
//         return ll;