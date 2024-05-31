class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i=0;i<=n;i++){
            if(n == i*i){
                answer = i;
                break;
            }
        }
        
        return answer ==-1 ? -1:(answer+1)*(answer+1);
    }
}