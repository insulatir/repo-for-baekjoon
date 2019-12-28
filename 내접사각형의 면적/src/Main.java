import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] len = new int[n];
		double[] s = new double[n*(n-1)*(n-2)*(n-3)/24];
		int si = 0;
		
		while(n != 0) {
			for(int i = 0; i < n; i++)
				len[i] = scanner.nextInt();
			
			for(int i = 0; i < n-3; i++)
				for(int j = i+1; j < n-2; j++)
					for(int k = j+1; k < n-1; k++)
						for(int l = k+1; l < n; l++) {
							int[] four = new int[4];
							four[0] = len[i];
							four[1] = len[j];
							four[2] = len[k];
							four[3] = len[l];
							
							int r = four[0];
							int ri = 0;
							
							for(int m = 0; m < four.length; m++) 
								if(r < four[m]) {
									r = four[m];
									ri = m;
								}
							
							switch(ri) {
							case 0:
								if((four[1]*r + four[2]*four[3] != Math.sqrt((r*r-four[2]*four[2])*(r*r-four[3]*four[3]))) && (four[2]*r + four[1]*four[3] != Math.sqrt((r*r-four[1]*four[1])*(r*r-four[3]*four[3]))) && (four[3]*r + four[2]*four[1] != Math.sqrt((r*r-four[2]*four[2])*(r*r-four[1]*four[1]))))
									continue;
								if(!((r*r > four[1]*four[1] + four[2]*four[2]) && (r*r > four[1]*four[1] + four[3]*four[3]) && (r*r > four[2]*four[2] + four[3]*four[3])))
									continue;
							case 1:
								if((four[0]*r + four[2]*four[3] != Math.sqrt((r*r-four[2]*four[2])*(r*r-four[3]*four[3]))) && (four[2]*r + four[0]*four[3] != Math.sqrt((r*r-four[0]*four[0])*(r*r-four[3]*four[3]))) && (four[3]*r + four[2]*four[0] != Math.sqrt((r*r-four[2]*four[2])*(r*r-four[0]*four[0]))))
									continue;
								if(!((r*r > four[0]*four[0] + four[2]*four[2]) && (r*r > four[0]*four[0] + four[3]*four[3]) && (r*r > four[2]*four[2] + four[3]*four[3])))
									continue;
							case 2:
								if((four[0]*r + four[1]*four[3] != Math.sqrt((r*r-four[1]*four[1])*(r*r-four[3]*four[3]))) && (four[1]*r + four[0]*four[3] != Math.sqrt((r*r-four[0]*four[0])*(r*r-four[3]*four[3]))) && (four[3]*r + four[1]*four[0] != Math.sqrt((r*r-four[1]*four[1])*(r*r-four[0]*four[0]))))
									continue;
								if(!((r*r > four[0]*four[0] + four[1]*four[1]) && (r*r > four[0]*four[0] + four[3]*four[3]) && (r*r > four[1]*four[1] + four[3]*four[3])))
									continue;
							case 3:
								if((four[0]*r + four[1]*four[2] != Math.sqrt((r*r-four[1]*four[1])*(r*r-four[2]*four[2]))) && (four[1]*r + four[0]*four[2] != Math.sqrt((r*r-four[0]*four[0])*(r*r-four[2]*four[2]))) && (four[2]*r + four[1]*four[0] != Math.sqrt((r*r-four[1]*four[1])*(r*r-four[0]*four[0]))))
									continue;
								if(!((r*r > four[0]*four[0] + four[1]*four[1]) && (r*r > four[0]*four[0] + four[2]*four[2]) && (r*r > four[1]*four[1] + four[2]*four[2])))
									continue;
							}
							
							switch(ri) {
							case 0:
								s[si++] = (four[1]*Math.sqrt(r*r-four[1]*four[1]) + four[2]*Math.sqrt(r*r-four[2]*four[2]) + four[3]*Math.sqrt(r*r-four[3]*four[3]))/4;
								break;
							case 1:
								s[si++] = (four[0]*Math.sqrt(r*r-four[0]*four[0]) + four[2]*Math.sqrt(r*r-four[2]*four[2]) + four[3]*Math.sqrt(r*r-four[3]*four[3]))/4;
								break;
							case 2:
								s[si++] = (four[0]*Math.sqrt(r*r-four[0]*four[0]) + four[1]*Math.sqrt(r*r-four[1]*four[1]) + four[3]*Math.sqrt(r*r-four[3]*four[3]))/4;
								break;
							case 3:
								s[si++] = (four[0]*Math.sqrt(r*r-four[0]*four[0]) + four[1]*Math.sqrt(r*r-four[1]*four[1]) + four[2]*Math.sqrt(r*r-four[2]*four[2]))/4;
								break;
							}
						}
			
			double maxs = s[0];
			double mins = s[0];
			
			for(int i = 0; i < s.length; i++) {
				if(maxs < s[i]) maxs = s[i];
				if(mins > s[i]) mins = s[i];
			}
			
			System.out.print("\n" + Math.round(mins*10)/10.0 + " " + Math.round(maxs*10)/10.0);
			
			n = scanner.nextInt();
			len = new int[n];
			s = new double[n*(n-1)*(n-2)*(n-3)/24];
			si = 0;
		}
		
		scanner.close();
	}

}
