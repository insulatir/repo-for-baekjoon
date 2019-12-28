import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String[] array = br.readLine().split(" ");
		long a = Long.parseLong(array[0]);
		long b = Long.parseLong(array[1]);
		long v = Long.parseLong(array[2]);
		
		long n = (long)Math.ceil((double)v/(double)(a-b));
		
		for(; (a-b)*n + b+b-a >= v; )
			n--;
		
		bw.write(n + "");
		
		bw.flush();
		bw.close();
	}

}
