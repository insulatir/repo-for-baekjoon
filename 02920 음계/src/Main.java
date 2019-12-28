import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] array = br.readLine().split(" ");
		if(array[0].equals("1") && array[1].equals("2") && array[2].equals("3") && array[3].equals("4") && array[4].equals("5") && array[5].equals("6") && array[6].equals("7") && array[7].equals("8"))
			bw.write("ascending");
		else if(array[0].equals("8") && array[1].equals("7") && array[2].equals("6") && array[3].equals("5") && array[4].equals("4") && array[5].equals("3") && array[6].equals("2") && array[7].equals("1"))
			bw.write("descending");
		else bw.write("mixed");
		bw.flush();
		bw.close();
	}

}
