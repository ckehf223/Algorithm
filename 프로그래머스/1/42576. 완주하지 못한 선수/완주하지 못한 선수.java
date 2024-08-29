import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        
		for(String data : completion) {
			if(map.get(data) != null) {
				map.replace(data, map.get(data)+1);
			}else {
				map.put(data, 1);
			}
		}
		
		for(String data : participant) {
			if(map.get(data) != null) {
				if(map.get(data) - 1 <0) {
					answer = data;
					break;
				}
				map.replace(data, map.get(data)-1);
			}else {
				answer = data;
				break;
			}
		}
        return answer;
    }
}