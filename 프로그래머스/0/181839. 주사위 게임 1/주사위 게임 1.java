class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1 && b%2==1){
            answer = a*a+b*b;
        }else if(a%2==1 || b%2==1){
            answer = (a+b)*2;
        }else{
            if(a >= b){
               answer = a-b;
            }else{
                answer = b-a;
            }
        }
        return answer;
    }
}