import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// ���簢���� �ʺ�
		int[] tile = new int[1001];
		// Ÿ�Ϸ� ä��� ����� �� ����
		
		tile[0] = 1;
		// �ƹ��͵� ä���� �ʴ� �͵� �� ���� ���
		tile[1] = 1;
		// 2x1 ũ���� ���簢���� ä��� ����� 2x1 Ÿ�Ϲۿ� ����
		for(int i = 2; i < tile.length; i++) {
			tile[i] = (tile[i-1] + tile[i-2]) % 10007;
			// tile[i-1]�� 2x1 Ÿ���� ���簢�� ���� ���̴� ���̰� tile[i-2]�� 1x2 Ÿ���� ���Ʒ��� �ٿ��� ���簢�� ���� ���̴� ����
		}
		
		System.out.print(tile[n]);
		// ��� ��ȯ
		
		scan.close();
	}

}
