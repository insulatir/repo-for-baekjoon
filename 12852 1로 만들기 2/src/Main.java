import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] Numbers = new int[N+1];
		int[] prev = new int[N+1];
		
		for (int i = 2; i < Numbers.length; i++) {
			int[] mins = new int[3];
			
			for (int j = 0; j < 3; j++) {
				mins[j] = Integer.MAX_VALUE;
			}
			
			int min = Integer.MAX_VALUE;
			
			if (i % 3 == 0) {
				mins[0] = Numbers[i/3] + 1;
			}
			
			if (i % 2 == 0) {
				mins[1] = Numbers[i/2] + 1;
			}
			
			mins[2] = Numbers[i-1] + 1;
			
			int num_has_min = 0;
			for (int j = 0; j < 3; j++) {
				if (min > mins[j]) {
					min = mins[j];
					num_has_min = j;
				}
			}
				
			Numbers[i] = min;
			
			switch (num_has_min) {
				case 0:
					prev[i] = i / 3;
					break;
				case 1:
					prev[i] = i / 2;
					break;
				case 2:
					prev[i] = i - 1;
					break;
			}
		}
		
		bw.write(Numbers[N] + "\n");
		while (N > 1) {
			bw.write(N + " ");
			N = prev[N];
		}
		
		bw.write("1");
		
		bw.flush();
		bw.close();
	}

}