import java.util.*;
public class Main {
	private static String[] tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a, b, c;
		Queue<String[]> q = new LinkedList<String[]>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		tree = new String[(int)Math.pow(2, 16)];
		String[] array = new String[3];
		map.put("A", 0);
		tree[0] = "A";
		for(int i = 0; i < n; i++) {
			a = scan.next();
			b = scan.next();
			c = scan.next();
			array[0] = a;
			array[1] = b;
			array[2] = c;
			if(map.containsKey(a)) {
				int index = map.get(a);
				map.put(b, 2*index+1);
				map.put(c, 2*index+2);
				tree[2*index+1] = b;
				tree[2*index+2] = c;
			}
			else {
				q.add(array);
			}
		}
		while(!q.isEmpty()) {
			array = q.remove();
			a = array[0];
			b = array[1];
			c = array[2];
			if(map.containsKey(a)) {
				int index = map.get(a);
				map.put(b, 2*index+1);
				map.put(c, 2*index+2);
				tree[2*index+1] = b;
				tree[2*index+2] = c;
			}
			else {
				q.add(array);
			}
		}
		preOrder(0);
		System.out.println();
		inOrder(0);
		System.out.println();
		postOrder(0);
		scan.close();
	}
	
	private static void preOrder(int i) {
		if(i >= tree.length)
			return;
		else if(tree[i].equals(".") || tree[i] == null)
			return;
		System.out.print(tree[i]);
		preOrder(2*i+1);
		preOrder(2*i+2);
	}
	
	private static void inOrder(int i) {
		if(i >= tree.length)
			return;
		else if(tree[i].equals(".") || tree[i] == null)
			return;
		inOrder(2*i+1);
		System.out.print(tree[i]);
		inOrder(2*i+2);
	}
	
	private static void postOrder(int i) {
		if(i >= tree.length)
			return;
		else if(tree[i].equals(".") || tree[i] == null)
			return;
		postOrder(2*i+1);
		postOrder(2*i+2);
		System.out.print(tree[i]);
	}
}
