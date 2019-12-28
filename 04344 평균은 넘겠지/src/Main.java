import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());
		String string = "";
		for(int i = 0; i < C; i++) {
			String[] a = br.readLine().split(" ");
			int N = Integer.parseInt(a[0]);
			int sum = 0;
			for(int j = 1; j <= N; j++)
				sum += Integer.parseInt(a[j]);
			double average = (double)(sum) / (double)(N);
			int count = 0;
			for(int j = 1; j <= N; j++)
				if(Double.parseDouble(a[j]) > average) count++;
			String result = String.format("%.3f", (double)(count) / (double)(N) * 100);
			// �Ҽ� ��°�ڸ����� �ݿø�, Math.round�� 0 ���� but String.format�� ����
			string += result + "%\n";
		}
		bw.write(string);
		bw.flush();
		bw.close();
	}

}
