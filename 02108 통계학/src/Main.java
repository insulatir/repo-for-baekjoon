import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String mean = "";
		int sum = 0;
		int median = 0;
		int mode = 0;
		int boundary = 0;
		int max = 0;
		int maxi = 0;
		int c = 0;
		int[] num = new int[N];
		int[] count = new int[8001];
		for(int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		for(int i = 0; i < N; i++) {
			sum += num[i];
		}
		mean = String.format("%.0f", (double)sum / (double)N);
		median = num[N/2];
		for(int i = 0; i < N; i++) {
			count[num[i]+4000]++;
		}
		for(int i = 0; i < 8001; i++) {
			if(max < count[i])  max = count[i];
		}
		for(int i = 0; i < 8001; i++) {
			if(count[i] == max) {
				c++;
				if(c == 1 || c == 2) maxi = i;
			}
		}
		mode = maxi-4000;
		boundary = num[N-1] - num[0];
		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(boundary);
		scan.close();
	}

}
