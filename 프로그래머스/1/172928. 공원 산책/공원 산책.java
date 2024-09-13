class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[][] ch = new int[park.length][park[0].toCharArray().length];
		int h =0;
		int w =0;
		
		for(int i=0;i<park.length;i++) {
			for(int j=0;j<park[i].length();j++) {
				if(park[i].charAt(j) == 'X') {
					ch[i][j] = -1;
				}else {
					ch[i][j] = 1;
				}
				if(park[i].charAt(j) == 'S') {
					h = i;
					w = j;
				}
			}
		}
		
		for(int i=0;i<routes.length;i++) {
			String str = routes[i].split(" ")[0];
			int count = Integer.parseInt(routes[i].split(" ")[1]);
			int temp = 0;
			boolean flag = true;
			for(int j=0;j<count;j++) {
				switch(str) {
				case "N": 
					if(h-1 >= 0 && ch[h-1][w] != -1 ) {
						h -= 1;
						temp++;
					}else {
						h += temp;
						flag = false;
					}
					break;
				case "S": 
					if(h+1 < ch.length && ch[h+1][w] != -1 ) {
						h += 1;
						temp++;
					}else {
						h -= temp;
						flag = false;
					}
					break;
				case "W": 
					if(w-1 >= 0 && ch[h][w-1] != -1 ) {
						w -= 1;
						temp++;
					}else {
						w += temp;
						flag = false;
					}
					break;
				case "E": 
					if(w+1 < ch[h].length && ch[h][w+1] != -1 ) {
						w += 1;
						temp++;
					}else {
						w -= temp;
						flag = false;
					}
					break;
				}
				if(!flag) {
					break;
				}
			}
		}
        answer[0] = h;
        answer[1] = w;
        return answer;
    }
}