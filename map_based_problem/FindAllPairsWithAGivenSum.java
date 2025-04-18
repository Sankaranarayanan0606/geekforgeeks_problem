package map_based_problem;

import java.util.*;

public class FindAllPairsWithAGivenSum {

    public static void main(String[] args) {

        int target = 9;
        int[] a = {1, 2, 4, 5, 7};
        int[] b = {5, 6, 3, 4, 8};
        pair[] result = allPairs(target, a, b);
        System.out.println(Arrays.toString(result));
    }
// Author solution
    public static pair[] allPairs(int target, int arr1[], int arr2[]) {
        // Your code goes here
        // Creating a map to store the occurrences of numbers from arr2.
        Map<Integer, Integer> mp2 = new HashMap<>();
        // Creating a list to store the pairs.
        List<pair> vp = new ArrayList<>();

        // Sorting array arr1 in ascending order.
        Arrays.sort(arr1);

        // Counting occurrences of numbers from arr2.
        for (int j : arr2) {
            mp2.put(j, mp2.getOrDefault(j, 0) + 1);
        }

        // Iterating over array arr1 to find pairs.
        for (int i = 0; i < arr1.length; i++) {
            // Checking if the complement of arr1[i] exists in arr2.
            for (int ct = 0; ct < mp2.getOrDefault(target - arr1[i], 0); ct++) {
                vp.add(new pair(arr1[i], target - arr1[i]));
            }
        }

        // Converting list of pairs to array of pairs
        pair[] result = new pair[vp.size()];
        result = vp.toArray(result);

        // Returning the array of pairs.
        return result;
    }

    //---------------------------------------------------------------------------------------------------------

//    public static pair[] allPairs(int target, int arr1[], int arr2[]) {
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        List<pair> answerList = new ArrayList<>();
//
//        for(int i = 0; i < arr2.length; i++)
//            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
//
//        Arrays.sort(arr1);
//
//        int index = 0;
//
//        for(int i = 0; i < arr1.length; i++)
//        {
//            int complement = target - arr1[i];
//            if(map.containsKey(complement))
//            {
//                int count = map.get(complement);
//                while(count != 0)
//                {
//                    answerList.add(new pair(arr1[i], complement));
//                    count--;
//                }
//            }
//        }
//
//        pair[] result = new pair[answerList.size()];
//        return answerList.toArray(result);
//    }

    //------------------------------------------------------------------------------------------------

//    public static  pair[] allPairs(int target, int[] arr1, int[] arr2) {
//        // Your code goes here
//        Set<Integer> set = new HashSet<>();
//        List<pair> resultList = new ArrayList<>();
//
//        for (int num : arr1)
//            set.add(num);
//
//        for (int num : arr2) {
//            int complement = target - num;
//            if (set.contains(complement)) {
//                resultList.add(new pair(complement, num));
//            }
//        }
//        Collections.sort(resultList, (a, b) -> {
//            if (a.first != b.first) return Long.compare(a.first, b.first);
//            return Long.compare(a.second, b.second);
//        });
//
//        // Convert List to Array
//        pair[] result = new pair[resultList.size()];
//        return resultList.toArray(result);
//    }
}

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + "]";
    }
}

