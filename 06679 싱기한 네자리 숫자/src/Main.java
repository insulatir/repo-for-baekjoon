
public class Main {

	public static void main(String[] args) {
		for(int i = 1000; i < 10000; i++) {
			int a, b, c;
			
			a = (i % 10) + (i / 10) % 10 + (i / (10 * 10)) % 10 + (i / (10 * 10 * 10));
			b = (i % 12) + (i / 12) % 12 + (i / (12 * 12)) % 12 + (i / (12 * 12 * 12));
			c = (i % 16) + (i / 16) % 16 + (i / (16 * 16)) % 16 + (i / (16 * 16 * 16));
			
			if((a == b) && (b == c))
				System.out.println(i);
		}
	}

}
