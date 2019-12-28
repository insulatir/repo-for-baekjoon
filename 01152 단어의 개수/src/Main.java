import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] array = br.readLine().split(" ");
		int result = array.length;	
		for(int i = 0; i < array.length; i++)
			if(array[i].equals("")) result--;
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
