import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=l;i<=r;i++){
            if(String.valueOf(i).matches("[05]+")){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        int[] a = new int[list.size()];
        for(int j =0;j<list.size();j++){
            a[j] = list.get(j);
        }
        return a;
    }
}