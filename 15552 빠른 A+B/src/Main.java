import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int T = Integer.parseInt(s); // string 반환이라 형 변환 필요
		for(int i = 0; i < T; i++) {
			s = bf.readLine();
			String[] array = s.split(" "); // 공백 나누기
			bw.write(Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + "\n");
		}
		bw.flush();
		bw.close();
		// bw는 buffer를 썼으므로 flush, close로 마무리
	}

}
