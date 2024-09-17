package enhance;



public class PTB2 {

    double HS2, HS1, HS0;

    public void updateHS(double k, double m, double n) {
        HS2 = k;
        HS1 = m;
        HS0 = n;
    }

    public String solve(boolean displayResult) {
        String result = "Phương trình bậc 2 dạng " + HS2 + "*x^2 + " + HS1 + "*x + " + HS0 + " = 0";

        if (HS2 == 0) {
            // Degenerates into a linear equation, use PTB1
            PTB1 linearEquation = new PTB1();
            linearEquation.updateHS(HS1, HS0);
            result = linearEquation.solve(displayResult);
            return result;
        } else {
            // Solve full quadratic equation
            double delta = HS1 * HS1 - 4 * HS2 * HS0;

            if (delta > 0) {
                double r1 = (-HS1 + Math.sqrt(delta)) / (2 * HS2);
                double r2 = (-HS1 - Math.sqrt(delta)) / (2 * HS2);
                result += " có 2 nghiệm phân biệt: " + r1 + ", " + r2;
            } else if (delta == 0) {
                double r3 = -HS1 / (2 * HS2);
                result += " có nghiệm kép: " + r3;
            } else {
                result += " vô nghiệm.";
            }

            if (displayResult) {
                System.out.println(result);
            }

            return result;
        }
    }
}
