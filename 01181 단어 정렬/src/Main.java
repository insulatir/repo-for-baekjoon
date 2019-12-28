import java.util.*;
import java.io.*;
public class Main {
	public static class Word {
		int len;
		String word;
		
		public Word(int len, String word) {
			this.len = len;
			this.word = word;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Word) {
				Word word = (Word) obj;
				if (this.word.equals(word.word)) {
					return true;
				}
			}
			
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Word> list = new ArrayList<Word>();
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			Word words = new Word(word.length(), word);
			if (!list.contains(words)) {
				list.add(words);
			}
		}
		
		list.sort(new Comparator<Word>() {
			public int compare(Word w1, Word w2) {
				if (w1.len == w2.len) {
					return w1.word.compareTo(w2.word); 
				}
				
				return Integer.compare(w1.len, w2.len);
			}
		});
		
		for (Word word : list) {
			bw.write(word.word + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
