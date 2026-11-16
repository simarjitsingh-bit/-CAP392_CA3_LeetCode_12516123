// 233. Number of Digit One //
class Solution {
    public int countDigitOne(int n) 
    {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) 
        {
            long divider = i * 10;
            count += (int) ((n / divider) * i);
            long remainder = n % divider;
            count += (int)Math.min(Math.max(remainder - i + 1, 0), i);
        }
        return count;
    }
}
