// 50. Pow(x, n) //
class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1.0 / x;
            power = -power;
        }

        return fastPower(x, power);
    }

    private double fastPower(double x, long n) {

        if (n == 0) {
            return 1.0;
        }

        double half = fastPower(x, n / 2);

        double result = half * half;

        if (n % 2 == 1) {
            result = result * x;
        }

        return result;
    }
}
