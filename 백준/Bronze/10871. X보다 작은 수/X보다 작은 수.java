import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			if(Integer.parseInt(input[i]) < Integer.parseInt(temp[1])) {
				bw.write(input[i]+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}