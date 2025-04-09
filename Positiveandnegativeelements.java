import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Positiveandnegativeelements {
    
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(-1, 2, -3, 4, -5, 6));

        System.out.println(arranged((ArrayList<Integer>) arr));
    }

    static ArrayList<Integer> arranged(ArrayList<Integer> arr) {

        // for(int i = 0; i < arr.size() - 1 ; i = i + 2)
        // {
                
        //         if(arr.get(i) < 0)
        //         {
        //             int temp = arr.get(i);
        //             arr.set(i, arr.get(i + 1));
        //             arr.set(i + 1, temp);
        //         }

        //         if(arr.get(i) < 0 && arr.get(i + 1) > 0)
        //         {
                    
        //         }
        // }



        // return arr;


        int n = arr.size();
        int i = 0, j = 0;
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // iterating till all elements are considered.
        while (i < n || j < n) {
            // if flag is 0, find next positive number and add it to ans.
            if (flag == 0) {
                while (i < n && arr.get(i) < 0) i++;
                if (i < n) {
                    ans.add(arr.get(i));
                    i++;
                }
                flag = 1;
            }
            // if flag is 1, find next negative number and add it to ans.
            else if (flag == 1) {
                while (j < n && arr.get(j) >= 0) j++;
                if (j < n) {
                    ans.add(arr.get(j));
                    j++;
                }
                flag = 0;
            }
        }
        // returning the arranged list of numbers.
        return ans;
    }
}
