package Two_pointer_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,5,6,-1,-3,5,-3,-2,-4,-5,-2,4,5,-3,-2));
        rearrange(arr);
    }
    
    static void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k= 0;

        for(int num : arr)
        {
            if(num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

    //   while(i < arr.size())
    //   {
    //     if(j < pos.size())
    //     {
    //         res.add(pos.get(j));
    //         j++;
    //     }
    //     if(k < neg.size())
    //     {
    //         res.add(neg.get(k));
    //         k++;
    //     }
    //     i++;
    //   }
    while(i < arr.size())
    {
        if(i < arr.size() && j < pos.size() && k < neg.size())
        {
            arr.set(i, pos.get(j));
            arr.set(i + 1, neg.get(k));
            i = i + 2;
            j++;
            k++;
        }
        else if(j < pos.size())
        {
            arr.set(i, pos.get(j));
            j++;
            i++;
        }
        else if(k < neg.size())
        {
            arr.set(i, neg.get(k));
            k++;
            i++;
        }
    }
       System.out.println(arr);
    }
}
