import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(; n != 0; ) {
			List<Integer> l = getChe(n+1, n+n);
			
			bw.write(l.size() + "\n");	
			
			n = Integer.parseInt(br.readLine());	
		}
		
		bw.flush();
		bw.close();
	}

	// �����佺�׳׽��� ü 
	private static List<Integer> getChe(int n, int m) {
		int[] arr = new int[m+1];
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 2; i*i <= m; i++) { // ������ �� : i
			if(arr[i] == 1) // �̹� üũ�� ���� ����� Ȯ������ �ʴ´�.
				continue;
			for(int j = i+i; j <= m; j += i) // i�� ������ i�� ������� 1�� üũ
				arr[j] = 1;
		}
			
		for(int i = n; i <= m; i++)
			if(arr[i] == 0 && i != 1)
				l.add(i);
		
		return l;
	}	
}
