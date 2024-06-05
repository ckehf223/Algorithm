import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height =0;
        for(int[] data : sizes){
            width = Math.max(width,Math.max(data[0],data[1]));
            height = Math.max(height,Math.min(data[0],data[1]));
        }
        return width*height;
    }
}