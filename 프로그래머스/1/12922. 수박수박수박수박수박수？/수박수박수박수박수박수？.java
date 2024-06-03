class Solution {
    public String solution(int n) {
        String answer = "";
        String a = "수";

        for(int i=1;i<=n;i++){
            answer += a;
            if(a.equals("수")){
                a = "박";
            }else{
                a = "수";
            }
        }
        return answer;
    }
}