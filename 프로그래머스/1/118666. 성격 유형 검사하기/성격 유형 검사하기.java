import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        char[] c1 = {'R','C','J','A'};
		char[] c2 = {'T','F','M','N'};
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < choices.length; i++) {
			switch (choices[i]) {
			case 1:
				map.put(survey[i].charAt(0), (map.getOrDefault(survey[i].charAt(0), 0) + 3));
				break;
			case 2:
				map.put(survey[i].charAt(0), (map.getOrDefault(survey[i].charAt(0), 0) + 2));
				break;
			case 3:
				map.put(survey[i].charAt(0), (map.getOrDefault(survey[i].charAt(0), 0) + 1));
				break;
			case 5:
				map.put(survey[i].charAt(1), (map.getOrDefault(survey[i].charAt(1), 0) + 1));
				break;
			case 6:
				map.put(survey[i].charAt(1), (map.getOrDefault(survey[i].charAt(1), 0) + 2));
				break;
			case 7:
				map.put(survey[i].charAt(1), (map.getOrDefault(survey[i].charAt(1), 0) + 3));
				break;
			}
		}
		for(int i=0;i<4;i++) {
			int temp1 = map.getOrDefault(c1[i], 0);
			int temp2 = map.getOrDefault(c2[i], 0);
			if(temp1 == temp2) {
				if(c1[i] > c2[i]) {
					sb.append(c2[i]);
				}else {
					sb.append(c1[i]);
				}
			}else if(temp1 > temp2) {
				sb.append(c1[i]);
			}else {
				sb.append(c2[i]);
			}
		}
        return sb.toString();
    }
}