import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		input.nextLine();
		String B = input.nextLine();
		String[] arr = B.split("");
		
		System.out.println(A*Integer.parseInt(arr[2]));
		System.out.println(A*Integer.parseInt(arr[1]));
		System.out.println(A*Integer.parseInt(arr[0]));
		System.out.println(A*Integer.parseInt(B));
	}
}