import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int count =0;
        int index = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                count++;
            }
        }
        answer = new int[arr.length-count];
        answer[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(!(arr[i-1] == arr[i])){
                answer[index] = arr[i];
                index++;
            }
        }
        

        return answer;
    }
}