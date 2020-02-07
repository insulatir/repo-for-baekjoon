import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String mid = scan.next();
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < mid.length(); i++) {
			char o = mid.charAt(i);
			if (o == '(') {
				s.push(o);
			} else if (o  == ')') {
				while (s.peek() != '(') {
					System.out.print(s.pop());
				}
				s.pop();
			} else if ('A' <= o && o <= 'Z') {
				System.out.print(o);
			} else {
				while (!(s.isEmpty() || priority(o) > priority(s.peek()))) {
					System.out.print(s.pop());
				}
				s.push(o);
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
		
		scan.close();
	}

	public static int priority(char o) {
		if (o == '(') {
			return 0;
		} else if (o == '+' || o == '-') {
			return 1;
		} else {
			return 2;
		}
	}
}
