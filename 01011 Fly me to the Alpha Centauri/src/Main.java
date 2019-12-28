import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String string = "";
		for(int i = 0; i < T; i++) {
			int l = 0;
			int h = 0;
			int result = 0;
			String[] array = br.readLine().split(" ");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			l = y-x;
			h = (int)Math.sqrt(l);
			if(l-h*h == 0) result = 2*h-1;
			else if(0 < l-h*h && l-h*h <= h) result = 2*h;
			else result = 2*h+1;			
			string += result + "\n";
		}
		bw.write(string);
		bw.flush();
		bw.close();
	}

}
