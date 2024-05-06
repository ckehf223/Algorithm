class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int num = num_list.length;
        
        for(int i=0;i<num;i++) {
			answer[i] = num_list[i];
            System.out.print(answer[i]);
		}  
        answer[num] = num_list[num-1] > num_list[num-2]? num_list[num-1]-num_list[num-2]: num_list[num-1]*2; 
        return answer;
    }
}