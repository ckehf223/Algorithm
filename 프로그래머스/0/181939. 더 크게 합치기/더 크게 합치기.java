class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aMax = Integer.parseInt(a+""+b);
        int bMax = Integer.parseInt(b+""+a);
        answer = aMax >= bMax ? aMax : bMax;
        return answer;
    }
}