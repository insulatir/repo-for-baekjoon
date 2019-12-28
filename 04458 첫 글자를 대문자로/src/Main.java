import java.io.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringBuilder statement = new StringBuilder(br.readLine());

			statement.replace(0, 1, (statement.charAt(0)+"").toUpperCase());
			
			System.out.println(statement);
		}
	}

}
