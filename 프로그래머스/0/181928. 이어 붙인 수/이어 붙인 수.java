class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int data : num_list){
            if(data % 2 == 0){
                even += data;
            }else{
                odd += data;
            }
        }
        answer = Integer.parseInt(even)+Integer.parseInt(odd);
        return answer;
    }
}