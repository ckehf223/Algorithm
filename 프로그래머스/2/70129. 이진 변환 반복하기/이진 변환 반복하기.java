class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
		int num = 0;
		
		while(!s.equals("1")) {
			answer[1] += s.length();
			num = s.replaceAll("0", "").length();
			s = Integer.toBinaryString(num);
			answer[0]++;
			answer[1] -= num;
		}
        return answer;
    }
}