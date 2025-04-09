package map_based_problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofArrayswithDistinct {

    public static void main(String[] args) {
        
        int a[] = {1, 2, 4, 3,3,3,3, 5, 6};
        int b[] = {3, 4,4,4,4,4, 5, 6, 7};
        System.out.println(numberofElementsInIntersection(a, b));
    }

    public static int numberofElementsInIntersection(int a[], int b[]) {

        int i = a.length - 1, j = b.length - 1;
        Arrays.sort(a);
        Arrays.sort(b);
        // Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();


        while(i >= 0 && j >= 0)
        {
            if(a[i] > b[j])
            {
                i--;
            }
            else if(a[i] == b[j])
            {
                set.add(a[i]);
                i--;
            }
            else
                j--;
        }
        return set.size();

        //Author solution
        // int n = a.length;
        // int m = b.length;
        // // using HashSet to store the elements.
        // HashSet<Integer> s1 = new HashSet<>();

        // int count = 0;

        // // we insert all the elements of first array in HashSet s1.
        // for (int i = 0; i < n; i++) s1.add(a[i]);

        // // iterating over the second array.
        // for (int i = 0; i < m; i++) {
        //     // if current element already exists in set, we update the counter.
        //     if (s1.contains(b[i])) {
        //         // incrementing the counter.
        //         count++;
        //     }
        // }

        // // returning the counter.
        // return count;
    }
    
}
