import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		for(; num != -1; ) {
			int count = 0;
			List<Integer> l = new ArrayList<Integer>();
			
			num = scan.nextInt();
			for(; num > 0; ) {
				l.add(num);
				num = scan.nextInt();
			}
			
			for(int i = 0; i < l.size(); i++) 
				for(int j = 0; j < l.size(); j++) 
					if(l.get(j) == l.get(i) * 2)
						count++;
			
			if(num != -1)
				System.out.println(count);
		}
		
		scan.close();
	}

}
