import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String string = br.readLine();
		int[] numbers = new int[10];
		int m = 0;
		for(int i = 0; i < string.length(); i++) {
			switch(string.charAt(i)) {
			case '0':
				numbers[0]++;
				break;
			case '1':
				numbers[1]++;
				break;
			case '2':
				numbers[2]++;
				break;
			case '3':
				numbers[3]++;
				break;
			case '4':
				numbers[4]++;
				break;
			case '5':
				numbers[5]++;
				break;
			case '6':
				numbers[6]++;
				break;
			case '7':
				numbers[7]++;
				break;
			case '8':
				numbers[8]++;
				break;
			case '9':
				numbers[9]++;
				break;	
			}
		}
		numbers[6] = numbers[9] = (numbers[6] + numbers[9] + 1) / 2;
		for(int i = 0; i < numbers.length; i++)
			if(m < numbers[i]) m = numbers[i];
		bw.write(m + "");
		bw.flush();
		bw.close();
	}

}
