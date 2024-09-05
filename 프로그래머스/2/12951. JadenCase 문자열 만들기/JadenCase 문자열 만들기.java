class Solution {
    public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(char c : s.toCharArray()) {
			if(flag) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
            flag = c == ' ' ? true : false ; 
		}
        return sb.toString();
    }
}