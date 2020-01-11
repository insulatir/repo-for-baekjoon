import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String value1 = scan.next();
		String operation = scan.next();
		String value2 = scan.next();
		
		boolean v1 = value1.equals("true");
		boolean v2 = value2.equals("true");
		
		System.out.print(operation.equals("AND")?v1&&v2:v1||v2);
		
		scan.close();
	}

}
