class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
		int[] arr = new int[ingredient.length];
		int size = 0;
		for (int i : ingredient) {
			arr[size++] = i;
			if (size >= 4 && arr[size - 1] == 1 
                && arr[size - 2] == 3 
                && arr[size - 3] == 2 
                && arr[size - 4] == 1) {
				size -= 4;
				answer++;
			}
		}
        return answer;
    }
}