import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
		for(int data : d) {
			if(data <= budget) {
				budget -= data;
				answer++;
			}
		}
        
        return answer;
    }
}