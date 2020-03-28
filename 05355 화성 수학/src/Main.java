import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < T; i++) {
			String lines = scan.nextLine();
			String[] line = lines.split(" ");
			double num = Double.parseDouble(line[0]);
			for (int j = 1; j < line.length; j++) {
				String op = line[j];
				if (op.equals("@")) {
					num *= 3;
				} else if (op.equals("%")) {
					num += 5;
				} else {
					num -= 7;
				}
			}
			
			System.out.println(String.format("%.2f", num));
		}
		
		scan.close();
	}

}
