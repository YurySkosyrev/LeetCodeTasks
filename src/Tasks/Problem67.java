package Tasks;

public class Problem67 {
    public static void main(String[] args) {

        System.out.println(addBinary("1010", "1011"));

    }

    static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        int sum = 0;

        while (i >= 0 || j >= 0 || carry != 0){

            if (i >=0) sum += a.charAt(i) - '0';
            if (j >=0) sum += b.charAt(j) - '0';
            sum += carry;

            carry = sum/2;

            result.append(sum%2);

            i--;
            j--;
            sum = 0;
        }

        return result.reverse().toString();
    }
}
