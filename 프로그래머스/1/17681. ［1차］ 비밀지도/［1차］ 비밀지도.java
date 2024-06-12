class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i=0;i<arr1.length;i++) {
			String binary = "";
			String binary2 = "";
			answer[i] = "";
			binary = Integer.toBinaryString(arr1[i]|arr2[i]);
			if(!(binary.length() == n)) {
				for(int j=0;j<n-binary.length();j++) {
					binary2 +="0";
				}
			}
			binary2 += binary;
			for(int k=0;k<binary2.length();k++) {
				if(binary2.charAt(k) =='0') {
					answer[i] +=" ";
				}else {
					answer[i] +="#";
				}
			}
		}
        return answer;
    }
}