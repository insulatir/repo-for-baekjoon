import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] Numbers = new int[N+1];
		for(int i = 2; i < Numbers.length; i++) {
			int[] mins = new int[3];
			for(int j = 0; j < 3; j++)
				mins[j] = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			if(i % 3 == 0) mins[0] = Numbers[i/3] + 1;
			if(i % 2 == 0) mins[1] = Numbers[i/2] + 1;
			mins[2] = Numbers[i-1] + 1;
			for(int j = 0; j < 3; j++)
				if(min > mins[j]) min = mins[j];
			Numbers[i] = min;
		}
		bw.write(Numbers[N] + "");
		bw.flush();
		bw.close();
	}

}
