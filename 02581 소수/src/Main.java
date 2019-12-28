import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		List<Integer> l = getChe(m, n);
		for(int i = 0; i < l.size(); i++)
			sum += l.get(i);
		
		if(l.size() != 0)
			bw.write(sum + "\n" + l.get(0));
		else
			bw.write(-1 + "");
		
		bw.flush();
		bw.close();
	}

	// 에라토스테네스의 체 
	private static List<Integer> getChe(int n, int m) {
		int[] arr = new int[m+1];
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 2; i*i <= m; i++) { // 나누는 값 : i
			if(arr[i] == 1) // 이미 체크된 수의 배수는 확인하지 않는다.
				continue;
			for(int j = i+i; j <= m; j += i) // i를 제외한 i의 배수들은 1로 체크
				arr[j] = 1;
		}
			
		for(int i = n; i <= m; i++)
			if(arr[i] == 0 && i != 1)
				l.add(i);
		
		return l;
	}	
}
