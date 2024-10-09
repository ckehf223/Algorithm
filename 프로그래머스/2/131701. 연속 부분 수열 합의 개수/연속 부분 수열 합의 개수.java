import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
		int temp = 0;
		for(int i=0;i<elements.length;i++) {
			temp = i;
			int sum = 0;
			for(int j=0;j<elements.length;j++) {
				if(temp == elements.length) {
					temp = 0;
				}
				sum += elements[temp];
				set.add(sum);
				temp++;
			}
		}
        return set.size();
    }
}