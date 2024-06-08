import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int index = commands[i][2];
			int[] copy = new int[end-start+1];
			System.arraycopy(array, start-1, copy, 0, end-start+1);
			Arrays.sort(copy);
			answer[i] = copy[index-1];
		}
        return answer;
    }
}