import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] score = {0,0,0};
		int[] stu1 = { 1, 2, 3, 4, 5 };
		int[] stu2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] stu3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		for(int i=0;i<answers.length;i++) {
			if(stu1[(i%5)] == answers[i]) {
				score[0]++;
			}
			if(stu2[(i%8)] == answers[i]) {
				score[1]++;
			}
			if(stu3[(i%10)] == answers[i]) {
				score[2]++;
			}
		}
		int max =Math.max(score[0],Math.max(score[1],score[2]));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<score.length;i++) {
			if(max == score[i]) {
				list.add(i+1);
			}
		}
		answer = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}