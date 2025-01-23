public class LTCode003 { 
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, result = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();

        String[] testCases = {"42","-42","4193 with words","words and 987","-91283472332","3.14159","+1","00000-42a1234","+0 123"       
        };

        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\" -> Output: " + solution.myAtoi(testCase));
            }
    }
}
