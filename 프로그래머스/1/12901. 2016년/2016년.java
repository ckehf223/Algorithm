import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] monthDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day_name = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int dateA = 0;
		for(int i=0;i<a-1;i++){
            dateA += monthDay[i];
        }
        dateA += b-1;
		answer = day_name[dateA%7];
        return answer;
    }
}