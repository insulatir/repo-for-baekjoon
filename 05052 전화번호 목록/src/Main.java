import java.util.*;
public class Main {
	public static class TrieNode {
		Map<Character, TrieNode> child_node = new HashMap<>();
		boolean last_char;
	}
	
	public static class Trie {
		TrieNode root_node;
		
		public Trie() {
			root_node = new TrieNode();
		}
		
		public void insert(String word) {
			TrieNode this_node = this.root_node;
			
			for (int i = 0; i < word.length(); i++) {
				this_node = this_node.child_node.computeIfAbsent(word.charAt(i), c -> new TrieNode());
			}
			
			this_node.last_char = true;
		}
		
		public boolean contain(String word) {
			TrieNode this_node = this.root_node;
			
			for (int i = 0; i < word.length(); i++) {
				TrieNode node = this_node.child_node.get(word.charAt(i));
				
				if (node == null) {
					return false;
				}
				
				this_node = node;
			}
			
			return !this_node.child_node.isEmpty();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			Trie trie = new Trie();
			String[] arr = new String[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scan.next();
				trie.insert(arr[j]);
			}
			boolean check = true;
			for (int j = 0; j < n; j++) {
				if (trie.contain(arr[j])) {
					check = false;
				}
			}
			
			System.out.println(check ? "YES" : "NO");
		}
		
		scan.close();
	}

}
