import java.util.*;
import java.io.*;
public class Main {
	public static class Location {
		int x;
		int y;
		
		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Location> list = new ArrayList<Location>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		list.sort(new Comparator<Location>() {
			public int compare(Location l1, Location l2) {
				if (l1.y == l2.y) {
					return Integer.compare(l1.x, l2.x);
				}
				
				return Integer.compare(l1.y, l2.y);
			}
		});
		
		for (Location loc : list) {
			bw.write(loc.x + " " + loc.y + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
