class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++) {
			int count =0;
			for(int j=1;j*j<=i;j++) {
				count+= i%j==0? (i==j*j?1:2):0;
			}
			answer += count > limit? power:count;
		}
        return answer;
    }
}