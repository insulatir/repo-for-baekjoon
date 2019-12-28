import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] number = new boolean[10001];
		String string = "";
		for(int i = 1; i <= 10000; i++)
			number[i] = false;
		for(int i = 1; i <= 10000; i++)
			if(func(i) <= 10000) number[func(i)] = true;
		for(int i = 1; i <= 10000; i++) {
			if(!number[i]) string += i + "\n";
		}
		bw.write(string);
		bw.flush();
		bw.close();
	}

	public static int func(int cons) {
		return cons +  cons % 10 + (cons / 10) % 10 + (cons / 100) % 10 + (cons / 1000) % 10 + (cons / 10000) % 10;
	}
}
