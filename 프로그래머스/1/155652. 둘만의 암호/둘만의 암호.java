import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        char[] ch = new char[s.length()]; 
		Map<Character, Boolean> map = new HashMap<>();
		for (char c : skip.toCharArray()) {
			map.put(c, true);
		}

		for (int i = 0; i < s.length(); i++) {
			int count = index;
			char c = s.charAt(i);
			for (int j = 0; j < count; j++) {
				if (c+1 > 'z') {
					c = 'a';
				}else {
					c = (char)(c+1);
				}
				if (map.getOrDefault(c, false)) {
					count++;
				} 
			}
			ch[i] = c;
		}
        return String.valueOf(ch);
    }
}