import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		int[] high =  k < score.length ? new int[k] : new int[score.length];
		int a= score[0];
		high[0] = score[0];
		answer[0] = score[0];
		for(int i=1;i<high.length;i++) {
			high[i] = score[i];
			a = a < score[i] ? a : score[i];
			answer[i] = a;
		}
        
		Arrays.sort(high);
		for(int i=k;i<score.length;i++) {
			if(high[0] < score[i]) {
				high[0] = score[i];
				Arrays.sort(high);
			}
			answer[i] = high[0];
		}
        return answer;
    }
}