import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int vowel = 0;
		
		String line = br.readLine();
		
		while (!line.equals("#")) {
			vowel = 0;
			for (char ch : line.toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
						|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowel += 1;
				}
			}
			
			System.out.println(vowel);

			line = br.readLine();
		}
	}

}
