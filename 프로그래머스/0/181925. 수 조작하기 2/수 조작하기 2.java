class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1;i<numLog.length;i++){
            if((numLog[i]-numLog[i-1])==1 || (numLog[i]-numLog[i-1])== -1){
                answer += (numLog[i]-numLog[i-1])==1? "w":"s";
            }else{
                answer += (numLog[i]-numLog[i-1])==10? "d":"a";
            }
        }
        return answer;
    }
}