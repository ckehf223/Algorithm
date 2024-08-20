class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int count = 0;
		int zero = 0;
        
        for(int i : lottos){
            if(i == 0){
                zero++;
                continue;
            }
            for(int j: win_nums){
                if(i == j){
                    count++;
                    continue;
                }
            }
        }
        answer[0] = getGrade(count+zero);
        answer[1] = getGrade(count);
        return answer;
    }
    public int getGrade(int num){
        return num == 0 ? 6 : 7 - num;
    }
}