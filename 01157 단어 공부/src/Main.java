import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().toUpperCase();
		String result = "";
		int[] alph = new int[26];
		int m = 0;
		int count = 0;
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'A':
				alph[0]++;
				break;
			case 'B':
				alph[1]++;
				break;
			case 'C':
				alph[2]++;
				break;
			case 'D':
				alph[3]++;
				break;
			case 'E':
				alph[4]++;
				break;
			case 'F':
				alph[5]++;
				break;
			case 'G':
				alph[6]++;
				break;
			case 'H':
				alph[7]++;
				break;
			case 'I':
				alph[8]++;
				break;
			case 'J':
				alph[9]++;
				break;
			case 'K':
				alph[10]++;
				break;
			case 'L':
				alph[11]++;
				break;
			case 'M':
				alph[12]++;
				break;
			case 'N':
				alph[13]++;
				break;
			case 'O':
				alph[14]++;
				break;
			case 'P':
				alph[15]++;
				break;
			case 'Q':
				alph[16]++;
				break;
			case 'R':
				alph[17]++;
				break;
			case 'S':
				alph[18]++;
				break;
			case 'T':
				alph[19]++;
				break;
			case 'U':
				alph[20]++;
				break;
			case 'V':
				alph[21]++;
				break;
			case 'W':
				alph[22]++;
				break;
			case 'X':
				alph[23]++;
				break;
			case 'Y':
				alph[24]++;
				break;
			case 'Z':
				alph[25]++;	
				break;
			}	
		}
		for(int i = 0; i < alph.length; i++) 
			if(m < alph[i]) {
				m = alph[i];
				index = i;
			}
		for(int i = 0; i < alph.length; i++) 
			if(m == alph[i]) count++;
		if(count > 1) result = "?";
		else {
			switch(index) {
			case 0:
				result = "A";
				break;
			case 1:
				result = "B";
				break;
			case 2:
				result = "C";
				break;
			case 3:
				result = "D";
				break;
			case 4:
				result = "E";
				break;
			case 5:
				result = "F";
				break;
			case 6:
				result = "G";
				break;
			case 7:
				result = "H";
				break;
			case 8:
				result = "I";
				break;
			case 9:
				result = "J";
				break;
			case 10:
				result = "K";
				break;
			case 11:
				result = "L";
				break;
			case 12:
				result = "M";
				break;
			case 13:
				result = "N";
				break;
			case 14:
				result = "O";
				break;
			case 15:
				result = "P";
				break;
			case 16:
				result = "Q";
				break;
			case 17:
				result = "R";
				break;
			case 18:
				result = "S";
				break;
			case 19:
				result = "T";
				break;
			case 20:
				result = "U";
				break;
			case 21:
				result = "V";
				break;
			case 22:
				result = "W";
				break;
			case 23:
				result = "X";
				break;
			case 24:
				result = "Y";
				break;
			case 25:
				result = "Z";
				break;
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
