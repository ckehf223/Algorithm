import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
		ArrayList<String> list = new ArrayList<>();
		for(String data : strings) {
			list.add(data.charAt(n)+data);
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i).substring(1,list.get(i).length());
		}
        return answer;
    }
}