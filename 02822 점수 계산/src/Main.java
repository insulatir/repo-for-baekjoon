import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[8];
		for (int i = 0; i < 8; i++) {
			score[i] = scan.nextInt();
		}
		
		int[] sortedScore = new int[8];
		for (int i = 0; i < 8; i++) {
			sortedScore[i] = score[i];
		}
		Arrays.sort(sortedScore);
		
		int sum = 0;
		int stand = sortedScore[2];
		List<Integer> checked = new LinkedList<Integer>();
		for (int i = 0; i < 8; i++) {
			if (score[i] > stand) {
				sum += score[i];
				checked.add(i+1);
			}
		}
		
		System.out.println(sum);
		for (int i = 0; i < 5; i++) {
			System.out.print(checked.get(i) + " ");
		}
		
		scan.close();
	}

}
