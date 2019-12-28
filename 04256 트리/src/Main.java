import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			int[] preorder = new int[n];
			int[] inorder = new int[n];
			for (int j = 0; j < n; j++) {
				preorder[j] = scan.nextInt();
			}
			for (int j = 0; j < n; j++) {
				inorder[j] = scan.nextInt();
			}
			
			printPostOrder(preorder, inorder);
			System.out.println();
		}
		
		scan.close();
	}

	public static void printPostOrder(int[] preorder, int[] inorder) {
		// 트리의 전위탐색 결과와 중위탐색 결과가 주어질 때 후위탐색 결과를 출력
		int N = preorder.length;
		// 트리에 포함된 노드의 수
		if (N == 0) {
			// 기저 사례: 텅 빈 트리면 곧장 종료
			return;
		}
		
		int root = preorder[0];
		// 이 트리의 루트는 전위 탐색 결과로부터 곧장 알 수 있음
		int L = 0;
		// 이 트리의 왼쪽 서브트리의 크기는 중위 탐색 결과에서 루트의 위치를 찾아서 알 수 있음
		for (int i = 0; i < N; i++) {
			if (inorder[i] == root) {
				L = i;
				break;
			}
		}
		
		printPostOrder(Arrays.copyOfRange(preorder, 1, L+1), Arrays.copyOfRange(inorder, 0, L));
		printPostOrder(Arrays.copyOfRange(preorder, L+1, N), Arrays.copyOfRange(inorder, L+1, N));
		// 왼쪽과 오른쪽 서브트리의 순회 결과 출력
		System.out.print(root + " ");
		// 후위 순회이므로 루트를 가장 마지막에 출력
	}
}
