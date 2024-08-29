import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		Map<Character,Integer> map = new HashMap<>();

		for(int i=0;i<keymap.length;i++) {
			for(int j=0;j<keymap[i].length();j++) {
				char c = keymap[i].charAt(j);
				if(map.get(c) != null) {
					int temp1 = map.get(c);
					if(temp1 > (keymap[i].indexOf(c)+1)) {
						map.remove(c);
						map.put(c, j+1);
					}
				}else {
					map.put(c, j+1);
				}
			}
		}
		
		for(int i=0;i<targets.length;i++) {
				int count = 0;
			for(char c : targets[i].toCharArray()) {
				if(map.get(c) != null) {
					count += map.get(c); 
				}else {
					count = -1;
					break;
				}
			}
			answer[i] = count;
		}
        return answer;
    }
}