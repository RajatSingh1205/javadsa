class Solution {
      int index = 0;

    public String decodeString(String s) {

        StringBuilder result = new StringBuilder();
        int k = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                index++;
                String inner = decodeString(s);

                while (k > 0) {
                    result.append(inner);
                    k--;
                }
            } else if (c == ']') {
                return result.toString();
            } else {
                result.append(c);
            }
            index++;
        }
        return result.toString();
    }
}
