package Tasks;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println(new Problem12().intToRoman(1994));
    }

    public String intToRoman(int num) {
        String[] roman = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] arabic = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String result = "";
        int index = -1;

        while(num>0){
            index++;
            while (num>=arabic[index]){
                result+=roman[index];
                num-=arabic[index];
            }
        }

        return result;
    }
}
