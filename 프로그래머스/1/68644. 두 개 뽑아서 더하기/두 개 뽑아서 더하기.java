import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> hs = new HashSet<>();
		for(int i=0;i<numbers.length;i++) {
			for(int j=1;j<numbers.length;j++) {
				if(!(i == j)){
					hs.add(numbers[i]+numbers[j]);
				}
			}
		}
		Integer[] answer = hs.toArray(new Integer[0]);
		Arrays.sort(answer);
        return answer;
    }
}