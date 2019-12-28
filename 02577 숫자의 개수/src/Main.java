import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int result = A * B * C;
		String string = Integer.toString(result);
		int[] a = new int[10];
		for(int i = 0; i < string.length(); i++) {
			char aChar = string.charAt(i);
			switch(aChar) {
			case '0':
				a[0]++;
				break;
			case '1':
				a[1]++;
				break;
			case '2':
				a[2]++;
				break;
			case '3':
				a[3]++;
				break;
			case '4':
				a[4]++;
				break;
			case '5':
				a[5]++;
				break;
			case '6':
				a[6]++;
				break;
			case '7':
				a[7]++;
				break;
			case '8':
				a[8]++;
				break;
			case '9':
				a[9]++;
				break;
			}
		}
		String aString = "";
		for(int i = 0; i < 10; i++)
			aString += a[i] + "\n";
		bw.write(aString);
		bw.flush();
		bw.close();
	}

}
