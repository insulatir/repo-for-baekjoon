import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int T = Integer.parseInt(s); // string ��ȯ�̶� �� ��ȯ �ʿ�
		for(int i = 0; i < T; i++) {
			s = bf.readLine();
			String[] array = s.split(" "); // ���� ������
			bw.write(Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + "\n");
		}
		bw.flush();
		bw.close();
		// bw�� buffer�� �����Ƿ� flush, close�� ������
	}

}
