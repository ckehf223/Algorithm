import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();
		String[] input = br.readLine().split(" ");
		String v = br.readLine();
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i].equals(v)) {
				count++;
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}