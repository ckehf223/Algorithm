import java.util.*;
class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
		new_id = new_id.toLowerCase().replaceAll("[^a-z0-9._-]", "");
		new_id = new_id.replaceAll("[.]{2,}",".");
		new_id = new_id.replaceAll("^[.]|[.]$","");
		sb.append(new_id);

		if(sb.length() <= 0) {
			sb.append("a");
            return "aaa";
		}
		while(sb.length() > 15) {
			sb.deleteCharAt(sb.length()-1);
		}
		if(sb.charAt(sb.length()-1) == '.'){
            sb.deleteCharAt(sb.length()-1);
        }
		while(sb.length() <= 2) {
			sb.append(sb.charAt(sb.length()-1));
		}
        return sb.toString();
    }
}