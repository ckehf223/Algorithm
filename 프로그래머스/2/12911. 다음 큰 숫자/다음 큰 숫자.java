class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n); 
		
		while(true) {
			n++;
			if(Integer.bitCount(n) == count) {
				return n;
			}
		}
    }
}