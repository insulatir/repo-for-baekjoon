import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Integer.parseInt(br.readLine());
		// int�� -20�� ~ 20��
		double n = 0;
		if(N == 1) n = 1;
		else n = Math.sqrt((double)(4*N-5)/(double)12) + 1.5;
		// 4*N���� N�� 10���̸� 40�̶� ���. ��, NaN
		int result = (int) n;
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
