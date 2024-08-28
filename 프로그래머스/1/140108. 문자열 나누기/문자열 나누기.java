class Solution {
    public int solution(String s) {
        int answer = 0;
      	char[] ch = s.toCharArray();
		boolean flag = false;
		int count = 0;
		while(!flag) {
			int temp1 = 1;
			int temp2 = 0;
			char a = ch[0];
			if(ch.length <=2) {
				answer++;
				flag = true;
				break;
			}
			for(int i=1;i<ch.length;i++) {
				if(temp1 == temp2) {
					count += i;
					ch = s.substring(count).toCharArray();
					answer++;
					break;
				}
				if(ch.length == i+1) {
					answer++;
					flag = true;
					break;
				}
				if(ch[i] == a) {
					temp1++;
				}else {
					temp2++;
				}
			}
		}
        return answer;
    }
}