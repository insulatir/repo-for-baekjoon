import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] stu = new int[31];
		for(int i = 0; i < 28; i++)
			stu[scan.nextInt()] = 1;
		for(int i = 1; i < 31; i++)
			if(stu[i] == 0) System.out.println(i);
		scan.close();
	}

}
