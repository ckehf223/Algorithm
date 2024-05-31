class Solution {
    public double solution(int[] arr) {
        int a = 0;
        for(int data : arr){
            a += data;
        }
        
        return (double)a/arr.length;
    }
}