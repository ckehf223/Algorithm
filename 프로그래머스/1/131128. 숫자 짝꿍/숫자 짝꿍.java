import java.util.*;
class Solution {
    public String solution(String X, String Y) {
       StringBuilder answer = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int count = 0;
		
		for (char c : X.toCharArray()) {
			if (map.get(c) != null) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c : Y.toCharArray()) {
			if(map.get(c) != null && map.get(c) > 0) {
				list.add(Integer.parseInt(String.valueOf(c)));
				map.replace(c, map.get(c)-1);
			}
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		if(list.size() > 0 && !list.isEmpty()) {
			for(Integer i : list) {
				count += i;
				answer.append(String.valueOf(i));
			}
			if(count <= 0) {
				answer = new StringBuilder(String.valueOf(0));
			}
		}else {
			answer.append(String.valueOf(-1));
		}
        
        return answer.toString();
    }
}