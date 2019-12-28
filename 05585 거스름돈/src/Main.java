import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int remain = 1000 - N;
		int res = 0;
		
		res += remain / 500;
		remain = remain % 500;
		res += remain / 100;
		remain = remain % 100;
		res += remain / 50;
		remain = remain % 50;
		res += remain / 10;
		remain = remain % 10;
		res += remain / 5;
		remain = remain % 5;
		res += remain / 1;
		remain = remain % 1;
		
		System.out.println(res);
		
		scan.close();
	}

}
