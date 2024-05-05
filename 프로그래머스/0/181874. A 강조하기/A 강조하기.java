class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chars = myString.toLowerCase().toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i] == 'a'){
                chars[i] = 'A';
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}