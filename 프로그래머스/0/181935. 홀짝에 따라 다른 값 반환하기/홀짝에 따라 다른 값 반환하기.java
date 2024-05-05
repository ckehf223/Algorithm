class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i += 2){
            answer += (n % 2 == 0) ? Math.pow(i,2) : i+1;
            System.out.print(i);
        }
        return answer;
    }
}