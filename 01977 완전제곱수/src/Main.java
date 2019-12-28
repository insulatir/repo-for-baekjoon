import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int result = 0;
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = m; i <= n; i++) 
			if(Math.sqrt(i) == (int)Math.sqrt(i))
				l.add(i);
		
		for(int i = 0; i < l.size(); i++)
			result += l.get(i);
		
		if(!l.isEmpty()) {
			System.out.println(result);
			System.out.println(l.get(0));
		}
		else
			System.out.println(-1);
			
		
		scan.close();
	}

}
