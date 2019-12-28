import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입출력을 위한 BuffredReader 및 BufferedWriter
		int n = Integer.parseInt(br.readLine());
		// readLine()으로 한 줄을 가져온 후 int 타입으로 변환하여 삼각형의 크기를 가져옵니다.
		int[][] tri = new int[n][n];
		// 정수 삼각형
		int[][] sum = new int[n][n];
		// 시작부터 (y, x)까지의 합
		int m = 0;
		// 최대 합
		
		for(int i = 0; i < n; i++) {
			String[] array = br.readLine().split(" ");
			// readLine()으로 한 줄을 가져온 후 split(" ")로 공백을 기준으로 잘라서 문자 배열을 만듭니다.
			for(int j = 0; j <= i; j++) {
				tri[i][j] = Integer.parseInt(array[j]);
				// int 타입으로 변환한 후 정수 삼각형의 알맞은 위치에 정수를 넣습니다.
			}
		}
		
		sum[0][0] = tri[0][0];
		// 시작 위치의 합은 그 위치의 정수와 같습니다.
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				// 첫 줄부터 마지막 줄까지 차례대로 앞부터 뒤의 순서로 반복문을 돕니다.
				if(j == 0) {
					// 줄의 맨 앞 위치인 경우
					sum[i][j] += sum[i-1][j] + tri[i][j];
					// 오른쪽 위만 가능합니다.
				} else if(j == i) {
					// 줄의 맨 뒤 위치인 경우
					sum[i][j] += sum[i-1][j-1] + tri[i][j];
					// 왼쪽 위만 가능
				} else {
					// 줄의 가운데인 경우
					sum[i][j] += Math.max(sum[i-1][j], sum[i-1][j-1]) + tri[i][j];
					// 왼쪽 위와 오른쪽 위의 합 중 큰 쪽을 선택합니다.
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(m < sum[n-1][i]) {
				m = sum[n-1][i];
				// 마지막 줄의 합들 중 가장 큰 합을 고릅니다.
			}
		}
		
		bw.write(m + "");
		bw.flush();
		bw.close();
	}
	
}
