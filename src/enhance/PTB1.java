package enhance;



public class PTB1 {

    double HS1, HS0;

    public void updateHS1(double k) {
        HS1 = k;
    }

    public void updateHS0(double k) {
        HS0 = k;
    }

    public void updateHS(double m, double n) {
        HS1 = m;
        HS0 = n;
    }

    public String solve(boolean displayResult) {
        // hàm solve dùng để giải phương trình
        // tham số displayResult để định nghĩa khi giải thì có hiển thị luôn
        // kết quả tìm được hay không. Nếu = true thì có hiển thị, nếu = false thì không hiển thị

        String result = "Phương trình bậc 1 dạng " + HS1 + "*x + " + HS0 + " = 0";

        if (HS1 != 0) {
            double x = -HS0 / HS1;
            result += " có 1 nghiệm x = " + x;
        } else if (HS0 == 0) {
            result += " có vô số nghiệm.";
        } else {
            result += " vô nghiệm.";
        }

        if (displayResult) {
            System.out.println(result);
        }

        return result;
    }

   
}
