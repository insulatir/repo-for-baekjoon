import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static class Location {
		double x;
		double y;
		
		public Location(double y, double x) {
			this.y = y;
			this.x = x;
		}
		
		public double distance(Location loc) {
			return (this.x - loc.x) * (this.x - loc.x)
					+ (this.y - loc.y) * (this.y - loc.y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Location> list = new ArrayList<>();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			list.add(new Location(y, x));
		}
		
		list.sort((Location loc1, Location loc2) -> Double.compare(loc1.x, loc2.x));
		bw.write((int)closest_pair(list) + "");
		
		bw.flush();
		bw.close();
	}

	public static double closest_pair(List<Location> P) {
		int n = P.size();
		double delta = Double.MAX_VALUE;
		if (P.size() <= 3) {
			for (int i = 0; i < P.size()-1; i++) {
				for (int j = i+1; j < P.size(); j++) {
					double ij = P.get(i).distance(P.get(j));
					if (delta > ij) {
						delta = ij;
					}
				}
			}
			
			return delta;
		}
		
		double L = (P.get(n/2).x + P.get(n/2+1).x) / 2.0;
		
		double delta1 = closest_pair(P.subList(0, n/2));
		double delta2 = closest_pair(P.subList(n/2, n));
		delta = Math.min(delta1, delta2);
		
		double sqrt = Math.sqrt(delta);
		
		List<Location> window = new ArrayList<>();
		for (Location loc : P) {
			if (L-sqrt <= loc.x && loc.x <= L+sqrt) {
				window.add(loc);
			}
		}
		
		window.sort((Location loc1, Location loc2) -> Double.compare(loc1.y, loc2.y));

		for (int i = 0; i < window.size()-1; i++) {
			for (int j = i+1; j+1 < window.size() && Math.abs(window.get(i).y - window.get(j).y) < sqrt; j++) {
				double ij = window.get(i).distance(window.get(j));
				if (delta > ij) {
					delta = ij;
				}
			}
		}
		
		return delta;
	}
}
