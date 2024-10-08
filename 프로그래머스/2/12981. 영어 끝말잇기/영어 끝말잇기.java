import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> set = new HashSet<>();
		Map<Integer,Integer> map = new HashMap<>();
		int temp = 0;
		char ch = words[0].charAt(0);
		
		for(int i=1;i<=n;i++) {
			map.put(i, 0);
		}
		
		for (int i = 0; i < words.length; i++) {
			temp++;
			if (temp > n) {
				temp = 1;
			}
			map.put(temp, map.get(temp)+1);
			if (set.contains(words[i])) {
				answer[0] = temp;
				answer[1] = map.get(temp);
				break;
			}else {
				set.add(words[i]);
				if(ch != words[i].charAt(0)) {
					answer[0] = temp;
					answer[1] = map.get(temp);
					break;
				}else {
					ch = words[i].charAt(words[i].length()-1);
				}
			}
		}

        return answer;
    }
}