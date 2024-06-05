import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int[] a = new int[sizes.length];
        int[] b = new int[sizes.length];
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] > sizes[i][1]){
                a[i] = sizes[i][0];
                b[i] = sizes[i][1];
            }else{
                b[i] = sizes[i][0];
                a[i] = sizes[i][1];
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return a[a.length-1]*b[b.length-1];
    }
}