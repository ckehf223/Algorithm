class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

		int left = 10;
		int right = 12;

		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) {
				left = n;
				answer.append("L");
			}
			if (n == 3 || n == 6 || n == 9) {
				right = n;
				answer.append("R");
			}
			if (n == 2 || n == 5 || n == 8 || n == 0) {
				if(n == 0) {
					n = 11;
				}
				int leftDiff = (Math.abs(n-left)/3) + (Math.abs(n - left)%3);
				int rightDiff = (Math.abs(n-right)/3) + (Math.abs(n - right)%3);
				
				if(leftDiff == rightDiff) {
					if(hand.equals("right")) {
						right = n;
						answer.append("R");
					}else {
						left = n;
						answer.append("L");
					}
				}else if(leftDiff > rightDiff) {
					right = n;
					answer.append("R");
				}else {
					left = n;
					answer.append("L");
				}
			}
		}
        return answer.toString();
    }
}