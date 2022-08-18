package Tasks;

public class Problem66 {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {

        int j = (digits[digits.length-1] == 9) ? digits.length + 1 : digits.length;

        int[] result = new int[j];

        int carry = 0;
        int nextNumb;

        for (int i = digits.length - 1; i > 0; i--){
            nextNumb = digits[i] + 1 + carry;
            result[j] = nextNumb%10;
            carry = nextNumb/10;

            j--;
        }

        if (carry > 0) {
            result[j] = 1;
        }

        return result;
    }

}
