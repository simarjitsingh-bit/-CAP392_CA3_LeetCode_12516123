// 273. Integer to English Words //
class Solution 
{
    String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };
    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };
    public String numberToWords(int num) 
    {
        if (num == 0) 
        {
            return "Zero";
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (num > 0) 
        {
            if (num % 1000 != 0) 
            {
                String part = helper(num % 1000);
                result.insert(0, part + thousands[index] + " ");
            }
            num = num / 1000;
            index++;
        }
        return result.toString().trim();
    }
    public String helper(int num) 
    {
        if (num == 0) 
        {
            return "";
        }
        if (num < 20) 
        {
            return belowTwenty[num] + " ";
        }
        if (num < 100) 
        {
            return tens[num / 10] + " " + helper(num % 10);
        }
        return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
    }
}
