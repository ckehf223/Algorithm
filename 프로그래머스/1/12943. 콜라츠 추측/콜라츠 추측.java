class Solution {
    public int solution(long num) {
        int answer = -1;
        if(num == 1){
            answer = 0;
        }else{
            for(int i=1;i<=500;i++){
                num = num%2 == 0? num/2: (num*3)+1;
                if(num == 1){
                    answer = i;
                    break;
                }
            }            
        }
        return answer;
    }
}