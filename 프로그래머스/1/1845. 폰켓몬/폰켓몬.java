import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		Set<Integer> set = new HashSet<>();
		for(int data : nums) {
			set.add(data);
		}
		answer = (nums.length/2) < set.size()? (int)nums.length/2:set.size();
        return answer;
    }
}