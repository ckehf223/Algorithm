class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        for(int i=0;i<s.length();i++) {
			if(s.equals("1"))
				break;
			if(s.charAt(i) == '0')
				answer[1]++;
			if(i == s.length()-1) {
				i = 0;
				s = Integer.toBinaryString(s.replaceAll("0", "").length());
				answer[0]++;
			}
		}
        return answer;
    }
}