class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] chars = control.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i] =='w' || chars[i] == 's'){
                n += chars[i] == 'w'? 1 : -1;
            }else{
                n += chars[i] == 'd'? 10:-10;
            }
            
        }
        return n;
    }
}