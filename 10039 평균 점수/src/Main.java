import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] scores = new int[5];
		int sum = 0;
		for(int i = 0; i < scores.length; i++)
			scores[i] = Integer.parseInt(br.readLine());
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < 40) scores[i] = 40;
			sum += scores[i];
		}
		int aver = sum / 5;
		bw.write(aver + "");
		bw.flush();
		bw.close();
	}

}
