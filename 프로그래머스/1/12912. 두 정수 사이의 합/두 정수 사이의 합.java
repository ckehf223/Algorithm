class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            answer = a;
        }
        if(a<b){
            for(int i=a;i<=b;i++){
                answer += (long)i;
             }    
        }
        if(b < a){
            for(int i=b;i<=a;i++){
                 answer += (long)i;
            }    
        }
       
        return answer;
    }
}