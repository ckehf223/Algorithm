import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
		
		for(int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		ArrayList<Integer> list = new ArrayList<>(map.values());
		list.sort(Collections.reverseOrder());
		
		int count = 0;
		int sum = 0;
		
		for(int i : list) {
			sum += i;
			count++;
			if(sum >= k) {
				break;
			}
		}
        return count;
    }
}