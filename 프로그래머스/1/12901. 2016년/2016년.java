import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, a-1);		
		cal.set(Calendar.DAY_OF_MONTH, b);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] day_name = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		answer = day_name[day-1];
        return answer;
    }
}