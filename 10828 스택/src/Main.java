import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String assign = scan.next();
			switch (assign) {
			case "push":
				stack.push(scan.nextInt());
				break;
			case "pop":
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.isEmpty() ? 1 : 0);
				break;
			case "top":
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
				break;
			}
		}
		
		scan.close();
	}

}
