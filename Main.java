public class Main {
    public static void main(String[] args) {
        int[] e = new int[10];
        int number = 20;
        for (int i = 0; i < 10; i++) {
            e[i] = number;
            number = number - 2;
        }
        double[] x = new double[13];
        for (int j = 0; j < 13; j++) {
            x[j] = -15.0 + (9.0 - (-15.0)) * Math.random();
        }
        double[][] e1 = new double[10][13];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                e1[i][j] = cal(e[i], x[j]);
            }
        }
        print(e1);
    }
    public static double cal(int ei, double xj) {
        if (ei == 18) {
            return Math.sin((1.0 / 2.0) / (1.0 / 2.0 - Math.atan((xj - 3) / 24.0)));
        } else if (ei == 4 || ei == 6 || ei == 10 || ei == 12 || ei == 20) {
            return 1.0 / 4.0 * (Math.exp(Math.pow(xj, xj / 2.0)) + 3.0 / 4.0);
        } else {
            return Math.atan(1.0 / Math.exp(Math.pow((5.0 / (Math.pow(Math.sin(xj), 2.0) + 1.0)), (Math.cbrt(Math.cos(xj)))) / 4.0));
        }
    }
    public static void print(double[][] e2) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("%12.5f ", e2[i][j]);
            }
            System.out.println();
        }
    }
}
