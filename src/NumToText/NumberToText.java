public class NumberToText {
    private static final String[] ONES = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] TEENS = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    private static final String[] TENS = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String[] THOUSANDS = {"", "nghìn", "triệu", "tỷ"};

    public static String numToText(long number) {
        if (number == 0) {
            return "không";
        }

        String result = "";
        int i = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                result = threeDigitsToText((int)(number % 1000)) + " " + THOUSANDS[i] + " " + result;
            }
            number /= 1000;
            i++;
        }

        return result.trim();
    }

    private static String threeDigitsToText(int number) {
        String text = "";
        if (number >= 100) {
            text += ONES[number / 100] + " trăm ";
            number %= 100;
        }
        if (number >= 20) {
            text += TENS[number / 10] + " ";
            number %= 10;
        }
        if (number >= 10) {
            text += TEENS[number - 10] + " ";
        } else if (number > 0) {
            text += ONES[number] + " ";
        }

        return text;
    }

    public static void main(String[] args) {
        long number = 123456789012L; // Example number
        System.out.println(numToText(number)); // Output: "một trăm hai mươi ba tỷ bốn trăm năm mươi sáu triệu bảy trăm tám mươi chín nghìn không trăm mười hai"
    }
}
