import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int result = 0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++)
			q.addLast(i);
		
		for(int i = 0; i < m; i++) {
			int sub = scan.nextInt();
			int subi = q.indexOf(sub);
			
			if(subi < q.size()-subi) {
				for(int j = 0; j < subi; j++) 
					q.addLast(q.removeFirst());
				
				result += subi;
				q.removeFirst();
			}
			else {
				for(int j = 0; j < q.size()-subi; j++)
					q.addFirst(q.removeLast());
				
				result += q.size()-subi;
				q.removeFirst();
			}
			
		}
		
		System.out.print(result);
		
		scan.close();
	}
	
}
