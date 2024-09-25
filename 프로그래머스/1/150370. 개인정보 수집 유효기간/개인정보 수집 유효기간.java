import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int todays = dateToDays(today);
		
		for(String str : terms) {
			String[] arr = str.split(" ");
			map.put(arr[0], Integer.parseInt(arr[1]));
		}
		
		for(int i=0;i<privacies.length;i++) {
			String[] arr = privacies[i].split(" ");
			
			int temp = dateToDays(arr[0]) + map.get(arr[1]) * 28;
			
			if(todays >= temp) {
				list.add(i+1);
			}
		}
		
		int[] answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
		
	}
	
	public static int dateToDays(String date) {
		String[] splitDate = date.split("\\.");
		int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        
        return year * 12 * 28 + month * 28 + day;
	}
}