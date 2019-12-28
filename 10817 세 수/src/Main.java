import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String string = br.readLine();
		String[] array = string.split(" ");
		int A = Integer.parseInt(array[0]);
		int B = Integer.parseInt(array[1]);
		int C = Integer.parseInt(array[2]);
		int result;
		if(A > B) {
			if(A > C) {
				if(B > C) result = B;
				else result = C;
			}
			else result = A;
		}
		else {
			if(A > C) {
				result = A;
			}
			else {
				if(B > C) result = C;
				else result = B;
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
