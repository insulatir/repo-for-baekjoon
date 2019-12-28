import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(str.length() == 1) {
				result++;
				continue;
			}
			int[] alph = new int[26];
			for(int j = 0; j < str.length(); j++) {
				if(j > 0) if(str.charAt(j) == str.charAt(j-1)) continue;
				switch(str.charAt(j)) {
				case 'a':
					alph[0]++;
					break;
				case 'b':
					alph[1]++;
					break;
				case 'c':
					alph[2]++;
					break;
				case 'd':
					alph[3]++;
					break;
				case 'e':
					alph[4]++;
					break;
				case 'f':
					alph[5]++;
					break;
				case 'g':
					alph[6]++;
					break;
				case 'h':
					alph[7]++;
					break;
				case 'i':
					alph[8]++;
					break;
				case 'j':
					alph[9]++;
					break;
				case 'k':
					alph[10]++;
					break;
				case 'l':
					alph[11]++;
					break;
				case 'm':
					alph[12]++;
					break;
				case 'n':
					alph[13]++;
					break;
				case 'o':
					alph[14]++;
					break;
				case 'p':
					alph[15]++;
					break;
				case 'q':
					alph[16]++;
					break;
				case 'r':
					alph[17]++;
					break;
				case 's':
					alph[18]++;
					break;
				case 't':
					alph[19]++;
					break;
				case 'u':
					alph[20]++;
					break;
				case 'v':
					alph[21]++;
					break;
				case 'w':
					alph[22]++;
					break;
				case 'x':
					alph[23]++;
					break;
				case 'y':
					alph[24]++;
					break;
				case 'z':
					alph[25]++;	
					break;
				}
			}
			result++;
			for(int j = 0; j < alph.length; j++) 
				if(alph[j] > 1) {
					result--;
					break;	
				}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
