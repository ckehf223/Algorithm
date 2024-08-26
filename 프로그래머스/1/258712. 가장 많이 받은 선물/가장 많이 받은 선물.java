class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
		int[] score = new int[friends.length];
		int[][] fc = new int[friends.length][friends.length];
		int[] count = new int[friends.length];
		
		for(int i=0;i<gifts.length;i++) {
			int a =0;
			int b =0;
			for(int j=0;j < friends.length;j++) {
				if(gifts[i].split(" ")[0].equals(friends[j])) {
					a  = j;
					score[j] += 1; 
				}
				if(gifts[i].split(" ")[1].equals(friends[j])) {
					b = j;
					score[j] -=1;
				}
			}
			fc[a][b] += 1; 
		}
		
		int[][] check = new int[friends.length][friends.length];
		
		for(int i=0;i<friends.length;i++) {
			for(int j=0;j<friends.length;j++) {
				if(i != j && check[i][j] != -2 && check[j][i] != -2){
					if(fc[i][j] == fc[j][i] ) {
						if(score[i] > score[j]) {
							count[i] += 1;
						}else if(score[j] > score[i]) {
							count[j] += 1;
						}
					}else if(fc[i][j] > fc[j][i]) {
						count[i] += 1;
					}else if(fc[i][j] < fc[j][i]) {
						count[j] += 1;
					}
				}
				check[i][j] = -2;
				check[j][i] = -2;
			}
		}
		
		for(int data : count) {
			if(data > answer) {
				answer = data;
			}
		}
        return answer;
    }
}