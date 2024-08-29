import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
		for(String data : completion) {
			if(map.get(data) != null) {
				int i = map.get(data);
				map.remove(data);
				map.put(data, i+1);
			}else {
				map.put(data, 1);
			}
		}
		
		for(String data : participant) {
			if(map.get(data) != null) {
				int count = map.get(data);
				if(count - 1 <0) {
					answer = data;
					break;
				}else {
					map.replace(data, count-1);
				}
			}else {
				answer = data;
				break;
			}
		}
        return answer;
    }
}