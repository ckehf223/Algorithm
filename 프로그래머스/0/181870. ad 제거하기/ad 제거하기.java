import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String[] strArr) {
      List<String> list = Arrays.stream(strArr)
          .filter(m -> !m.contains("ad"))
          .collect(Collectors.toList());
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}