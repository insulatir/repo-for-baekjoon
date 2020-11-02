import java.util.*;
public class Main {
	public static ArrayList<Integer>[] arr1;
	public static ArrayList<Integer>[] arr2;
	public static boolean[] visited;
	public static Stack<Integer> stack;
	public static ArrayList<ArrayList<Integer>> solution;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		int E = scan.nextInt();
		
		arr1 = new ArrayList[V+1];
		arr2 = new ArrayList[V+1];
		for (int i = 0; i < V+1; i++) {
			arr1[i] = new ArrayList<>();
			arr2[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < E; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr1[a].add(b);
			arr2[b].add(a);
		}
		
		visited = new boolean[V+1];
		stack = new Stack<>();
		for (int i = 1; i <= V; i++) {
			if (!visited[i]) {
				dfs1(i);
			}
		}
		
		solution = new ArrayList<>();
		
		visited = new boolean[V+1];
		int count = 0;
		while (!stack.isEmpty()) {
			int top = stack.lastElement();
			stack.removeElement(top);
			if (!visited[top]) {
				solution.add(new ArrayList<>());
				dfs2(top, count);
				count += 1;
			}
		}
		
		for (int i = 0; i < solution.size(); i++) {
			Collections.sort(solution.get(i));
		}
		
		for (int i = 0; i < solution.size(); i++) {
			for (int j = i+1; j < solution.size(); j++) {
				if (solution.get(i).get(0) > solution.get(j).get(0)) {
					ArrayList<Integer> temp = solution.get(i);
					solution.set(i, solution.get(j));
					solution.set(j, temp);
				}
			}
		}
		
		System.out.println(solution.size());
		
		for (int i = 0; i < solution.size(); i++) {
			for (int j : solution.get(i)) {
				System.out.print(j + " ");
			}
			System.out.println(-1);
		}
		
		scan.close();
	}

	public static void dfs1(int v) {
		visited[v] = true;
		
		for (int next : arr1[v]) {
			if (!visited[next]) {
				dfs1(next);
			}
		}
		
		stack.push(v);
	}
	
	public static void dfs2(int v, int count) {
		visited[v] = true;
		
		for (int next : arr2[v]) {
			if (!visited[next]) {
				dfs2(next, count);
			}
		}
		
		solution.get(count).add(v);
	}
}
