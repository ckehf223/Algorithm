class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int data: num_list){
            if(data == n){
                answer = 1;
            }
        }
        return answer;
    }
}