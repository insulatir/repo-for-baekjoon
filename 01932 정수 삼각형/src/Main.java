import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// ������� ���� BuffredReader �� BufferedWriter
		int n = Integer.parseInt(br.readLine());
		// readLine()���� �� ���� ������ �� int Ÿ������ ��ȯ�Ͽ� �ﰢ���� ũ�⸦ �����ɴϴ�.
		int[][] tri = new int[n][n];
		// ���� �ﰢ��
		int[][] sum = new int[n][n];
		// ���ۺ��� (y, x)������ ��
		int m = 0;
		// �ִ� ��
		
		for(int i = 0; i < n; i++) {
			String[] array = br.readLine().split(" ");
			// readLine()���� �� ���� ������ �� split(" ")�� ������ �������� �߶� ���� �迭�� ����ϴ�.
			for(int j = 0; j <= i; j++) {
				tri[i][j] = Integer.parseInt(array[j]);
				// int Ÿ������ ��ȯ�� �� ���� �ﰢ���� �˸��� ��ġ�� ������ �ֽ��ϴ�.
			}
		}
		
		sum[0][0] = tri[0][0];
		// ���� ��ġ�� ���� �� ��ġ�� ������ �����ϴ�.
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				// ù �ٺ��� ������ �ٱ��� ���ʴ�� �պ��� ���� ������ �ݺ����� ���ϴ�.
				if(j == 0) {
					// ���� �� �� ��ġ�� ���
					sum[i][j] += sum[i-1][j] + tri[i][j];
					// ������ ���� �����մϴ�.
				} else if(j == i) {
					// ���� �� �� ��ġ�� ���
					sum[i][j] += sum[i-1][j-1] + tri[i][j];
					// ���� ���� ����
				} else {
					// ���� ����� ���
					sum[i][j] += Math.max(sum[i-1][j], sum[i-1][j-1]) + tri[i][j];
					// ���� ���� ������ ���� �� �� ū ���� �����մϴ�.
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(m < sum[n-1][i]) {
				m = sum[n-1][i];
				// ������ ���� �յ� �� ���� ū ���� ���ϴ�.
			}
		}
		
		bw.write(m + "");
		bw.flush();
		bw.close();
	}
	
}
