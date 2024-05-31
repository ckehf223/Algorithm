class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        int index = 0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].contains("ad")){
                count++;
            }
        }
         String[] answer = new String[strArr.length-count];
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                answer[index] = strArr[i];
                index++;
            }
        }
        return answer;
    }
}