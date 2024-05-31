import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
		List<Integer> list = Arrays.stream(arr)
				.filter(e-> e%divisor ==0)
				.boxed()
				.collect(Collectors.toList());
        
		Collections.sort(list);
		
        if(list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for(int i=0;i<list.size();i++) {
				answer[i] = list.get(i);
			}
		}
        return answer;
    }
}