import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {
	public static class InvList {
		List<Integer> list;
		long r;
		
		public InvList(long r, List<Integer> list) {
			this.list = list;
			this.r = r;
		}
		
		public int count() {
			return list.size();
		}
		
		public InvList half(int pos) {
			int len = list.size();
			List<Integer> half = new ArrayList<>();
			
			for (int i = 0; i < (len+1-pos)/2; i++) {
				half.add(list.get(i + pos*(len+1)/2));
			}
			
			return new InvList(r, half);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		while (st.hasMoreElements()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		InvList L = new InvList(0, list);
		bw.write(sort_and_count(L).r + "");
		
		bw.flush();
		bw.close();
	}

	public static InvList sort_and_count(InvList L) {
		if (L.count() == 1) {
			return new InvList(0, L.list);
		}
		
		// Divide the list into two halves A and B
		InvList A = L.half(0);
		InvList B = L.half(1);
		InvList rA = sort_and_count(A);
		InvList rB = sort_and_count(B);
		L = merge_and_count(rA, rB);
		
		return new InvList(rA.r + rB.r + L.r, L.list);
	}

	private static InvList merge_and_count(InvList A, InvList B) {
		long inversion_count = 0;
		int indexA = 0;
		int indexB = 0;
		List<Integer> L = new ArrayList<>();
		while (indexA < A.count() && indexB < B.count()) {	// 한 쪽이 리스트 끝에 다다를 때까지
			if (A.list.get(indexA) > B.list.get(indexB)) {
				inversion_count += A.count() - indexA;
				L.add(B.list.get(indexB));
				indexB += 1;
			} else {
				L.add(A.list.get(indexA));
				indexA += 1;
			}
		}
		
		// 남은 리스트 추가
		L.addAll(A.list.subList(indexA, A.count()));
		L.addAll(B.list.subList(indexB, B.count()));
		
		return new InvList(inversion_count, L);
	}
}
