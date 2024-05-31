class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int y =0;
        int p =0;
        for(int i = 0;i<s.length();i++){
            if(s.toLowerCase().charAt(i) == 'p'){
                p++;
            }
            if(s.toLowerCase().charAt(i) =='y'){
                y++;
            }
        }
        if(p == y){
            answer = true;
        }

        return answer;
    }
}