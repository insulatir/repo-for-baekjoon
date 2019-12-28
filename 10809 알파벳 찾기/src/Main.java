import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		String result = "";
		int[] alp = new int[26];
		for(int i = 0; i < alp.length; i++)
			alp[i] = -1;
		for(int i = 0; i < S.length(); i++) {
			switch(S.charAt(i)) {
			case 'a':
				if(alp[0] == -1) alp[0] = i;
				break;
			case 'b':
				if(alp[1] == -1) alp[1] = i;
				break;
			case 'c':
				if(alp[2] == -1) alp[2] = i;
				break;
			case 'd':
				if(alp[3] == -1) alp[3] = i;
				break;
			case 'e':
				if(alp[4] == -1) alp[4] = i;
				break;
			case 'f':
				if(alp[5] == -1) alp[5] = i;
				break;
			case 'g':
				if(alp[6] == -1) alp[6] = i;
				break;
			case 'h':
				if(alp[7] == -1) alp[7] = i;
				break;
			case 'i':
				if(alp[8] == -1) alp[8] = i;
				break;
			case 'j':
				if(alp[9] == -1) alp[9] = i;
				break;
			case 'k':
				if(alp[10] == -1) alp[10] = i;
				break;
			case 'l':
				if(alp[11] == -1) alp[11] = i;
				break;
			case 'm':
				if(alp[12] == -1) alp[12] = i;
				break;
			case 'n':
				if(alp[13] == -1) alp[13] = i;
				break;
			case 'o':
				if(alp[14] == -1) alp[14] = i;
				break;
			case 'p':
				if(alp[15] == -1) alp[15] = i;
				break;
			case 'q':
				if(alp[16] == -1) alp[16] = i;
				break;
			case 'r':
				if(alp[17] == -1) alp[17] = i;
				break;
			case 's':
				if(alp[18] == -1) alp[18] = i;
				break;
			case 't':
				if(alp[19] == -1) alp[19] = i;
				break;
			case 'u':
				if(alp[20] == -1) alp[20] = i;
				break;
			case 'v':
				if(alp[21] == -1) alp[21] = i;
				break;
			case 'w':
				if(alp[22] == -1) alp[22] = i;
				break;
			case 'x':
				if(alp[23] == -1) alp[23] = i;
				break;
			case 'y':
				if(alp[24] == -1) alp[24] = i;
				break;
			case 'z':
				if(alp[25] == -1) alp[25] = i;
				break;			
			}
		}
		for(int i = 0; i < 26; i++)
			result += alp[i] + " ";
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
