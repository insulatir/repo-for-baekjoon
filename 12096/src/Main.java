import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("02-521-0487");
		
		bw.flush();
		bw.close();
	}

}
