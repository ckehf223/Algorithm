class Solution {
    public String solution(String s) {
        s = " "+s;
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<s.toCharArray().length;i++) {
			if(s.charAt(i) == ' ') {
				sb.append(" ");
				continue;
			}
			if(s.charAt(i-1) == ' ') {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}else {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
		}
        return sb.toString();
    }
}