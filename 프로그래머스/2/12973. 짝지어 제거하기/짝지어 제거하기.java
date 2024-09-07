import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Byte> stack = new Stack<>();
		for(byte b : s.getBytes()) {
			if(!stack.isEmpty() && b == stack.peek()) {
				stack.pop();
			}else {
				stack.push(b);
			}
		}
		answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }
}