import java.util.*;
public class Main {
	static List<List<Integer>> graph = new LinkedList<List<Integer>>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		
		Stack<Integer> s = new Stack<Integer>();
		int[] visit = new int[n];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0; i <= n; i++)
			graph.add(new LinkedList<Integer>());
		
		for(int i = 0; i < m; i++)
			add(scan.nextInt(), scan.nextInt());
		
		s.push(v);
		
		for(int i = 0; !s.isEmpty(); i++) {
			int x = s.pop();
			int[] ys = new int[graph.get(x).size()];
			
			if(visit[x-1] == 0)
				System.out.print(x + " ");
			
			visit[x-1] = 1;
			
			for(int j = 0; j < graph.get(x).size(); j++) 
				ys[j] = graph.get(x).get(j);
			
			Arrays.sort(ys);
			
			for(int j = 0; j < graph.get(x).size(); j++) {
				int y = ys[graph.get(x).size()-1-j];
				
				if(visit[y-1] == 0) 
					s.push(y);
			}
		}
		
		for(int i = 0; i < n; i++)
			visit[i] = 0;
		
		System.out.println();
		
		visit[v-1] = 1;
		
		q.add(v);
		
		for(; !q.isEmpty(); ) {
			int x = q.remove();
			int[] ys = new int[graph.get(x).size()];
			
			System.out.print(x + " ");
			
			for(int i = 0; i < graph.get(x).size(); i++) 
				ys[i] = graph.get(x).get(i);
			
			Arrays.sort(ys);
			
			for(int i = 0; i < graph.get(x).size(); i++) {
				int y = ys[i];
				
				if(visit[y-1] == 0) {
					visit[y-1] = 1;
					q.add(y);
				}
			}
		}
		
		scan.close();
	}

	private static void add(int v, int w) {
		graph.get(v).add(w);
		graph.get(w).add(v);
	}
	
}
