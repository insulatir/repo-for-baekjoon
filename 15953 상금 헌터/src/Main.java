import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] r7 = new int[101];
		int[] r8 = new int[65];
		r7[1] = 5000000;
		r7[2] = r7[3] = 3000000;
		r7[4] = r7[5] = r7[6] = 2000000;
		r7[7] = r7[8] = r7[9] = r7[10] = 500000;
		r7[11] = r7[12] = r7[13] = r7[14] = r7[15] = 300000;
		r7[16] = r7[17] = r7[18] = r7[19] = r7[20] = r7[21] = 100000;
		r8[1] = 5120000;
		r8[2] = r8[3] = 2560000;
		r8[4] = r8[5] = r8[6] = r8[7] = 1280000;
		r8[8] = r8[9] = r8[10] = r8[11] = r8[12] = r8[13] = r8[14] = r8[15] = 640000;
		r8[16] = r8[17] = r8[18] = r8[19] = r8[20] = r8[21] = r8[22] = r8[23] = r8[24] = r8[25] = r8[26] = r8[27] = r8[28] = r8[29] = r8[30] = r8[31] = 320000;
		for(int i = 0; i < t; i++) {
			System.out.println(r7[scan.nextInt()] + r8[scan.nextInt()]);
		}
			
		scan.close();
	}

}
