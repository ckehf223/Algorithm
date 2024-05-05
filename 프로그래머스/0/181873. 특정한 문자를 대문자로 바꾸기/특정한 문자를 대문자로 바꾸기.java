class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        char[] strTochar = my_string.toCharArray();
        for(int i=0;i<strTochar.length;i++){
            if(strTochar[i] == alp.charAt(0)){
                strTochar[i] = (char)(strTochar[i]-32);
            }
        }
        answer = String.valueOf(strTochar);
        return answer;
    }
}