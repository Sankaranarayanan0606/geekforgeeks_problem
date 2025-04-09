package map_based_problem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicates {
    public static void main(String[] args) {
        
        int arr[] = {2};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        
        // Set<Integer> set = new HashSet<>();
        // List<Integer> result = new ArrayList<>();

        // if(arr.length == 1) return result;
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(set.contains(arr[i]))
        //         result.add(arr[i]);
        //     else    
        //         set.add(arr[i]);
        // }

        // return result;
        //author ans
        Map<Integer, Integer> freqMap =
            new HashMap<>(); // HashMap to store the frequency of elements

        // Count the frequency of each element in the array
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>(); // List to store the result

        // Check for elements that appear more than once
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result; // Return th
    }
}
