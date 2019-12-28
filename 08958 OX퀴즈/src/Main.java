import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			String ox = br.readLine();
			int count = 0;
			int sum = 0;
			for(int j = 0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else count = 0;
			}
			array[i] = sum;
		}
		for(int i = 0; i < n; i++)
			bw.write(array[i] + "\n");
		bw.flush();
		bw.close();
	}

}
