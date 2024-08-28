import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        char[] ch = new char[s.length()]; 
		for (int i = 0; i < s.length(); i++) {
			int count = index;
			char c = s.charAt(i);
			for (int j = 0; j < count; j++) {
				c = c == 'z' ? 'a':(char)(c+1);
				if (skip.contains(String.valueOf(c))) {
					count++;
				} 
			}
			ch[i] = c;
		}
        return String.valueOf(ch);
    }
}