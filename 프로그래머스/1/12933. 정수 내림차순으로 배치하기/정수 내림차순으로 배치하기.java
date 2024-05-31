import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str =String.valueOf(n).split("");
		List<String> list = new ArrayList<>();
		for(String data : str) {
			list.add(data);
		}
        
		Collections.sort(list);
		Collections.reverse(list);
		String str1 = "";
		for(String data : list) {
			str1 += data;
		}
		answer = Long.parseLong(str1);
        return answer;
    }
}