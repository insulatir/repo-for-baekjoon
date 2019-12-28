import java.io.*;
public class Main {
	static String rec0 = "\"����Լ��� ������?\"\n";
	static String rec1 = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n";
	static String rec2 = "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n"; 
	static String rec3	= "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n";
	static int N;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		print(N);
		
		bw.flush();
		bw.close();
	}

	public static void print(int n) throws IOException {
		for (int i = 0; i < N-n; i++) {
			bw.write("____");
		}
		bw.write(rec0);
		for (int i = 0; i < N-n; i++) {
			bw.write("____");
		}
		
		if (n != 0) {
			bw.write(rec1);
			for (int i = 0; i < N-n; i++) {
				bw.write("____");
			}
			bw.write(rec2);
			for (int i = 0; i < N-n; i++) {
				bw.write("____");
			}
			bw.write(rec3);
		} else {
			bw.write("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			for (int i = 0; i < N-n; i++) {
				bw.write("____");
			}
			bw.write("��� �亯�Ͽ���.\n");
			return;
		}
		
		print(n-1);
		
		for (int i = 0; i < N-n; i++) {
			bw.write("____");
		}
		bw.write("��� �亯�Ͽ���.\n");
	}
}
