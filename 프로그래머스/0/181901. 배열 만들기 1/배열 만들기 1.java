class Solution {
    public int[] solution(int n, int k) {
        int a = (int)(n/k);
        int[] answer = new int[a];
        // if(n%k == 0){
        //     answer = new int[n/k];
        // }else{
        //     answer = new int[]
        // }
        int index = 0;
        for(int i=1;i<=n;i++){
            if(i%k == 0){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}