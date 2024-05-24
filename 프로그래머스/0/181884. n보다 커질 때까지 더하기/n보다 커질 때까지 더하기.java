class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int data : numbers){
            if(answer > n){
                break;
            }else{
                answer += data;    
            }
        }
       return answer;
    }
}