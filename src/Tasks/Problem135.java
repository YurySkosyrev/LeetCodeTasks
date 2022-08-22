package Tasks;

import java.util.Arrays;

public class Problem135 {
    public static void main(String[] args) {
        int[] input = new int[]{1,0,2,3,4,1};
        System.out.println(candy(input));
    }

    static int candy(int[] ratings) {

        int[] candies = new int[ratings.length];

        Arrays.fill(candies, 1);

        for (int i = 1; i <= ratings.length-1; i ++){
            if (ratings[i-1] < ratings [i]) {
                candies[i] = candies[i-1] + 1;
            }
        }

        for (int i = ratings.length-2; i >= 0; i--){
            if (ratings[i] > ratings [i+1]) {
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }

        return Arrays.stream(candies).sum();
    }

    static int candy2(int[] ratings) {

        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        int sum = 0;

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i <= ratings.length-1; i ++){
            if (ratings[i-1] < ratings [i]) {
                left[i] = left[i-1] + 1;
            }
        }

        for (int i = ratings.length-2; i >= 0; i--){
            if (ratings[i] > ratings [i+1]) {
                right[i] = right[i+1] + 1;
            }
        }

        for (int i = 0; i < ratings.length; i++){
            sum+=Math.max(left[i], right[i]);
        }
        return sum;
    }
}
