class Solution {
    public String solution(int[] food) {
        String answer ="";
        int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<food.length;i++) {
			count = food[i]%2 == 0?food[i]/2 : (food[i]-1)/2;
			for(int j=0;j<count;j++) {
				sb.append(i);
			}
		}
		answer = sb.toString()+"0"+sb.reverse(); 
        return answer;
    }
}