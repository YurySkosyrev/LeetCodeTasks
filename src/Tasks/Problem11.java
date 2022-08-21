package Tasks;

public class Problem11 {
    public static void main(String[] args) {

        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new Problem11().maxArea(a));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxSum = 0;
        int nextSum;
        int leftHeight, rightHeight, minHeight;

        while (left != right){
            leftHeight = height[left];
            rightHeight = height[right];
            minHeight = Math.min(leftHeight,rightHeight);
            nextSum = (right-left)*minHeight;
            if (nextSum > maxSum){
                maxSum = nextSum;
            }
            if (leftHeight == minHeight) {
                left++;
            } else {
                right--;
            }
        }
        return maxSum;
    }
}
