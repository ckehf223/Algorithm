import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 0;
		if(A == B && B == C) {
			result = 10000+A*1000;
		}else if(A == B || A == C || B == C){
			if(B == C) {
				result = 1000+B*100;
			}else {
				result = 1000+A*100;
			}
		}else {
			int max = Math.max(A, Math.max(B, C));
			result = max*100;
		}
		System.out.println(result);
	}
}
