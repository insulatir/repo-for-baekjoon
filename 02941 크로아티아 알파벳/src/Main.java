import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
				result++;
				break;
			case 'b':
				result++;
				break;
			case 'c':
				result++;
				break;
			case 'd':
				result++;
				break;
			case 'e':
				result++;
				break;
			case 'f':
				result++;
				break;
			case 'g':
				result++;
				break;
			case 'h':
				result++;
				break;
			case 'i':
				result++;
				break;
			case 'j':
				if((i >= 1) && ((str.charAt(i-1) == 'l') || (str.charAt(i-1) == 'n')))
					result--;
				result++;
				break;
			case 'k':
				result++;
				break;
			case 'l':
				result++;
				break;
			case 'm':
				result++;
				break;
			case 'n':
				result++;
				break;
			case 'o':
				result++;
				break;
			case 'p':
				result++;
				break;
			case 'q':
				result++;
				break;
			case 'r':
				result++;
				break;
			case 's':
				result++;
				break;
			case 't':
				result++;
				break;
			case 'u':
				result++;
				break;
			case 'v':
				result++;
				break;
			case 'w':
				result++;
				break;
			case 'x':
				result++;
				break;
			case 'y':
				result++;
				break;
			case 'z':
				result++;
				break;
			case '-':
				break;
			case '=':
				if(str.charAt(i-1) == 'z')
					if(i >= 2 && str.charAt(i-2) == 'd')
						result--;
				break;
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
