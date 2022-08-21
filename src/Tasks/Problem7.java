package Tasks;

public class Problem7 {

    public static void main(String[] args) {

    }

    public int reverse(int x) {
        int tail;
        int result = 0;
        int newResult = 0;

        while (x !=0){
            tail = x%10;
            newResult = newResult*10 + tail;

            if (newResult/10 != result){
                return 0;
            }

            result = newResult;
            x /= 10;
        }

        return result;
    }
}
