package Binary_Search_Based_prob;

public class IndexOfAnExtraElement {

    public static void main(String[] args) {

        int[] a = {3,5};
        int[] b = {5};
        System.out.println(findExtra(a, b));
    }

    public static int findExtra(int[] a, int[] b) {
        int n = a.length;
        int index = n - 1;

        // left and right are end
        // points denoting the current range.
        int left = 0, right = n - 2;
        while (left <= right) {
            int mid = (left + right) / 2;

            // If middle element is same
            // of both arrays, it means
            // that extra element is after
            // mid so we update left to mid+1
            if (b[mid] == a[mid]) left = mid + 1;

                // If middle element is different
                // of the arrays, it means that
                // the index we are searching for
                // is either mid, or before mid.
                // Hence we update right to mid-1.
            else {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than
        // left, our search is complete.
        return index;
    }

//    public static int findExtra(int[] a, int[] b) {
//        // add code here.
//        int len = a.length;
//        int start = 0, end = len - 1;
//
//        if(a[0] != b[0]) return 0;
//        if(a[a.length - 2] == b[b.length - 1]) return len - 1;
//
//        while (start <= end)
//        {
//            int mid = start + end / 2;
//
//            if(a[mid] == b[mid] && a[mid + 1] != b[mid + 1] )
//            {
//                return mid + 1;
//            }
//            else if (a[mid] < b[mid])
//            {
//                end = mid - 1;
//            }
//            else {
//                start = mid + 1;
//            }
//        }
//        return 0;
//    }
}
