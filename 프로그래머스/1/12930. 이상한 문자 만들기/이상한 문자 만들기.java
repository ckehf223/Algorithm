class Solution {
    public String solution(String s) {
       String answer = "";
        String[] arr = s.split(" ",-1);
        for(int i=0;i<arr.length;i++){
            char[] ch = arr[i].toCharArray();
            for(int j=0;j<ch.length;j++){
            	answer += j%2==0 ? Character.toUpperCase(ch[j]):Character.toLowerCase(ch[j]);
            }
            if(!(i== arr.length-1)){
                answer += " ";
            }
        }
        return answer;
    }
}