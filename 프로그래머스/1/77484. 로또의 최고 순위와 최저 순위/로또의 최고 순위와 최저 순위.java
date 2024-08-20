class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int count = 0;
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;
				}
			}
			if (lottos[i] == 0) {
				zero++;
			}
		}

		int score = count + zero;

		answer[0] = (7 - score) == 7 ? 6 : 7 - score;
		answer[1] = (7 - count) == 7 ? 6 : 7 - count;
        return answer;
    }
}