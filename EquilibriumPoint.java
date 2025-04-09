public class EquilibriumPoint {
    
    public static void main(String[] args) {
        
        int arr[] = {8, 8, 3 ,7 ,8 ,2 ,7 ,2};
        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int arr[]) {
        //int result = 0;
        int mid  = arr.length - 1 / 2;
        int ans1 = 0, ans2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i == mid)
            {
                ans1 = ans2;
                ans2 = 0;
            }
            else{
                ans2+=arr[i];
            }
        }
        if(ans1 == ans2)
            return mid;
        return -1;
    }
}
