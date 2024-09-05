class Solution {
    public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(char c : s.toCharArray()) {
			if(flag) {
				sb.append(Character.toUpperCase(c));
                flag = false;
			}else {
				sb.append(Character.toLowerCase(c));
			}
            
            if(c == ' ') {
                flag = true;
			}
		}
        return sb.toString();
    }
}