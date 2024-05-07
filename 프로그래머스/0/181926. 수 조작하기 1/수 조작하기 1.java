class Solution {
    public int solution(int n, String control) {
        for(char chars : control.toCharArray()){
            switch(chars){
                case 'w': n+= 1;
                    break;
                case 's': n+= -1;
                    break;
                case 'd': n += 10;
                    break;
                case 'a': n += -10;
                    break;
            }
        }
        return n;
    }
}