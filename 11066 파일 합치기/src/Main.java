import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for(int i = 0; i < t; i++) {
			int k = scan.nextInt();
			int[] page = new int[k];
			int min = Integer.MAX_VALUE;
			
			for(int j = 0; j < k; j++)
				page[j] = scan.nextInt();
			
			for(int o = 0; o < k-1; o++)
				for(int j = 0; j < k; j++) 
					for(int l = j+1; l < k; l++)
						if(min > page[j] + page[l]) {
							min = page[j] + page[l];
							page[j] = min;
							page[l] = 10000000;
						}
			
			System.out.println(min);
		}
		
		scan.close();
	}

}
