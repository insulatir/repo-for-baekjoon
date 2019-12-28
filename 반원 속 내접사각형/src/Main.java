import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt(); 							// 선분의 길이의 개수
		int[] len = new int[n]; 							// 선분의 길이의 배열
		double[] s = new double[n*(n-1)*(n-2)*(n-3)/24]; 	// 가능한 내접사각형들의 면적들의 배열
		int si = 0; 										// s의 인덱스
		
		while(n != 0) {
			for(int i = 0; i < n; i++)
				len[i] = scanner.nextInt(); 				
			
			for(int i = 0; i < n-3; i++)
				for(int j = i+1; j < n-2; j++)
					for(int k = j+1; k < n-1; k++)
						for(int l = k+1; l < n; l++) {
							int[] four = new int[4];		// len 배열에서 4개의 원소를 순서없이 뽑는 경우
							four[0] = len[i];
							four[1] = len[j];
							four[2] = len[k];
							four[3] = len[l];
							
							int r = four[0];				// r = four배열 중 가장 큰 값(지름)
							int ri = 0;						// r이 four배열에서 가지는 인덱스
							
							for(int m = 0; m < four.length; m++) 
								if(r < four[m]) {
									r = four[m];
									ri = m;
								}
							
							switch(ri) {					
							case 0:
								if(((four[1]*r + four[2]*four[3])*(four[1]*r + four[2]*four[3]) != (r*r-four[2]*four[2])*(r*r-four[3]*four[3])) && ((four[2]*r + four[1]*four[3])*(four[2]*r + four[1]*four[3]) != (r*r-four[1]*four[1])*(r*r-four[3]*four[3])) && ((four[3]*r + four[2]*four[1])*(four[3]*r + four[2]*four[1]) != (r*r-four[2]*four[2])*(r*r-four[1]*four[1])))
									continue;				// 톨레미의 정리(내접사각형의 조건) 
								if(!((r*r > four[1]*four[1] + four[2]*four[2]) && (r*r > four[1]*four[1] + four[3]*four[3]) && (r*r > four[2]*four[2] + four[3]*four[3])))
									continue;				// 반원에 접할 조건
							case 1:
								if(((four[0]*r + four[2]*four[3])*(four[0]*r + four[2]*four[3]) != (r*r-four[2]*four[2])*(r*r-four[3]*four[3])) && ((four[2]*r + four[0]*four[3])*(four[2]*r + four[0]*four[3]) != (r*r-four[0]*four[0])*(r*r-four[3]*four[3])) && ((four[3]*r + four[2]*four[0])*(four[3]*r + four[2]*four[0]) != (r*r-four[2]*four[2])*(r*r-four[0]*four[0])))
									continue;
								if(!((r*r > four[0]*four[0] + four[2]*four[2]) && (r*r > four[0]*four[0] + four[3]*four[3]) && (r*r > four[2]*four[2] + four[3]*four[3])))
									continue;
							case 2:
								if(((four[0]*r + four[1]*four[3])*(four[0]*r + four[1]*four[3]) != (r*r-four[1]*four[1])*(r*r-four[3]*four[3])) && ((four[1]*r + four[0]*four[3])*(four[1]*r + four[0]*four[3]) != (r*r-four[0]*four[0])*(r*r-four[3]*four[3])) && ((four[3]*r + four[1]*four[0])*(four[3]*r + four[1]*four[0]) != (r*r-four[1]*four[1])*(r*r-four[0]*four[0])))
									continue;
								if(!((r*r > four[0]*four[0] + four[1]*four[1]) && (r*r > four[0]*four[0] + four[3]*four[3]) && (r*r > four[1]*four[1] + four[3]*four[3])))
									continue;
							case 3:
								if(((four[0]*r + four[1]*four[2])*(four[0]*r + four[1]*four[2]) != (r*r-four[1]*four[1])*(r*r-four[2]*four[2])) && ((four[1]*r + four[0]*four[2])*(four[1]*r + four[0]*four[2]) != (r*r-four[0]*four[0])*(r*r-four[2]*four[2])) && ((four[2]*r + four[1]*four[0])*(four[2]*r + four[1]*four[0]) != (r*r-four[1]*four[1])*(r*r-four[0]*four[0])))
									continue;
								if(!((r*r > four[0]*four[0] + four[1]*four[1]) && (r*r > four[0]*four[0] + four[2]*four[2]) && (r*r > four[1]*four[1] + four[2]*four[2])))
									continue;
							}
							
							switch(ri) {
							case 0:
								s[si++] = (four[1]*Math.sqrt(r*r-four[1]*four[1]) + four[2]*Math.sqrt(r*r-four[2]*four[2]) + four[3]*Math.sqrt(r*r-four[3]*four[3]))/4;
								break;						// 사각형의 면적
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
			
			double maxs = s[0];								// 가장 큰 면적
			double mins = s[0];								// 가장 작은 면적
			
			for(int i = 0; i < si; i++) {
				if(maxs < s[i]) maxs = s[i];
				if(mins > s[i]) mins = s[i];
			}
			
			System.out.println(Math.round(mins*10)/10.0 + " " + Math.round(maxs*10)/10.0);
			
			n = scanner.nextInt();
			len = new int[n];
			s = new double[n*(n-1)*(n-2)*(n-3)/24];
			si = 0;
		}
		
		scanner.close();
	}

}
