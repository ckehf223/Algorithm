import java.util.*;
class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
		new_id = new_id.toLowerCase().replaceAll("[^a-z0-9._-]", "");
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<new_id.length();i++) {
			if(new_id.charAt(i) == '.') {
				if(list.isEmpty() || new_id.charAt(i) != list.get(list.size()-1)) {
					list.add(new_id.charAt(i));
				}
			}else {
				list.add(new_id.charAt(i));
			}
		}
	
		
        while(!list.isEmpty() && list.get(0) == '.') {
			list.remove(0);
		}
		while(!list.isEmpty() && list.get(list.size()-1) == '.') {
			list.remove(list.size()-1);
		}
        if(list.isEmpty()) {
			list.add('a');
            return "aaa";
		}
		while(list.size() > 15) {
			list.remove(list.size()-1);
		}
        if(list.get(list.size()-1) == '.'){
            list.remove(list.size()-1);
        }
		while(list.size() <= 2) {
			list.add(list.get(list.size()-1));
		}

		for(char c : list) {
			sb.append(c);
		}
        return sb.toString();
    }
}