import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
		Arrays.sort(ch);
	    answer = new StringBuilder(String.valueOf(ch)).reverse().toString();
        return answer;
    }
}