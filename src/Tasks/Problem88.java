package Tasks;

public class Problem88 {

    public static void main(String[] args) {

        int[] a = new int[]{2,4,5,0,0,0};
        int[] b = new int[]{1,3,5};
        merge(a, 3, b, 3);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int last = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last] = nums1[i];
                i-- ;
            } else {
                nums1[last] = nums2[j];
                j-- ;
            }
            last --;
        }

        while (j >= 0){
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }
}
