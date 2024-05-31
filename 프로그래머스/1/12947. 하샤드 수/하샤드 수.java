class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String[] arr = String.valueOf(x).split("");
        int a =0;
        for(int i=0;i<arr.length;i++){
            a += Integer.parseInt(arr[i]);
        }
        if(x%a == 0){
            answer = true;
        }
        return answer;
    }
}