class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        char[] chars = code.toCharArray();
       for(int i=0;i<chars.length;i++) {
			if(mode == 0) {
				if(chars[i] == '1') {
					mode = 1;
				}else {
					ret += i % 2 ==0? chars[i] : "";
				}
			}else {
				if(chars[i] == '1') {
					mode = 0;
				}else {
					ret += i % 2 !=0? chars[i] : "";
				}
			}
		}
        if(ret == ""){
            ret = "EMPTY";
        }
        answer = ret;
        return answer;
    }
}