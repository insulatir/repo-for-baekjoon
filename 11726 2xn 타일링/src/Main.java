import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// 직사각형의 너비
		int[] tile = new int[1001];
		// 타일로 채우는 방법의 수 저장
		
		tile[0] = 1;
		// 아무것도 채우지 않는 것도 한 가지 방법
		tile[1] = 1;
		// 2x1 크기의 직사각형을 채우는 방법은 2x1 타일밖에 없음
		for(int i = 2; i < tile.length; i++) {
			tile[i] = (tile[i-1] + tile[i-2]) % 10007;
			// tile[i-1]은 2x1 타일을 직사각형 끝에 붙이는 것이고 tile[i-2]는 1x2 타일을 위아래로 붙여서 직사각형 끝에 붙이는 것임
		}
		
		System.out.print(tile[n]);
		// 결과 반환
		
		scan.close();
	}

}
