public class fact {
    public static void main(String[] args) {
        
        int n=4;
        int acc = 1;
        System.out.println(fra(n, acc));
    }


    public static int fra(int n ,int acc){
        if(n == 0)
            return acc;

        return fra(n-1, n * acc);
    }

    
}

