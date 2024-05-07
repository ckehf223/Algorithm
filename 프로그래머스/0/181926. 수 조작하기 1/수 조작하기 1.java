class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] chars = control.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i] == 'w'){
                n += 1;
            }else if(chars[i] == 's'){
                n += -1;
            }else if(chars[i] == 'd'){
                n += 10;
            }else{
                n += -10;
            }
            
        }
        return n;
    }
}