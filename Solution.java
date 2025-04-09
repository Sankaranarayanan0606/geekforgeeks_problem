

class Solution{

    public static void main(String[] args) {
        System.out.println(oppositeFaceOfDice(4, 3, 3));
    }
    static int oppositeFaceOfDice(int a, int r, int n) {
        
        // int diff = a2 - a1;
        // int temp = a1;
        // for(int i = 1; i < n ; i++ )
        // {
        //     temp+=diff;
                
        // }
        // return temp;
        int temp = a;
        for(int i = 1; i< n; i++)
        {
            temp*=r;
            System.out.println(temp);
        }
        return temp;
        
    }
}