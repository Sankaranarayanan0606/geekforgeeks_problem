import java.util.Arrays;

public class ElementsintheRange {
    public static void main(String[] args) {
        int arr[] = {9 ,1 ,4, 6, 5 ,5, 9 ,4 ,10, 2, 4 ,2 ,3, 5 ,9 ,9 ,1 ,1, 2};
        System.out.println(check_elements(arr, 19, 10, 11));
    }


    static boolean check_elements(int arr[], int n, int A, int B) {

        Arrays.sort(arr);
        boolean temp = false;
        int num = A;
        if(A == B && arr[n - 1] == A) return true;
        if(arr[n - 1] == A) return false;
        for(int i = 0; i < n; i++){
            if(num == B && arr[i] == B)
                return true;
            else if(num == arr[i]){
                temp = true;
                num++;
            }   
            else
                temp = false;
        }
        return temp;
    }
}
