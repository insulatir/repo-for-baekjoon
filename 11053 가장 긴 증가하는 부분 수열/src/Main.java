import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// n�� �����ɴϴ�.
		int[] array = new int[n];
		// ���� A�� ���� �迭�Դϴ�.
		int[] len = new int[n];
		// ���̸� �����մϴ�.
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			// ���� A�� �����ɴϴ�.
		}
		
		for(int i = 0; i < n; i++) {
			if(len[i] == 0) {
				// ������ �Ǵ� i��° ����
				len[i] = 1;
				// �ڱ� �ڽ��� ������ ���ԵǹǷ� ���̴� 1�� ��
			}
						
			for(int j = 0; j < i; j++) {	
				// 0��° ���� �������� �ٷ� �ձ���
				if(array[i] > array[j]) {
					// ���� ����
					if(len[i] < len[j] + 1) {
						// ���� ���ұ����� ���̺��� j��° ���ұ����� ���� + 1�� �� ũ�ٸ� �̴� ���� ���ұ����� ������ ���̰� �ִ밡 �ƴϹǷ�
						len[i] = len[j] + 1;
						// �ִ� ���̷� �ٲپ��ݴϴ�.
					}
				}
			}
		}
		
		Arrays.sort(len);
		// �� ���ķ� �����մϴ�.
		
		System.out.print(len[len.length-1]);
		// ���������̹Ƿ� ���� �� ������ ���̴� ������ ���Ұ� �˴ϴ�.
		
		scan.close();
	}

}
