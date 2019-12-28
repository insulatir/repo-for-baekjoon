import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1967, "DavidBowie");
		map.put(1969, "SpaceOddity");
		map.put(1970, "TheManWhoSoldTheWorld");
		map.put(1971, "HunkyDory");
		map.put(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
		map.put(1973, "AladdinSane\n1973 PinUps");
		map.put(1974, "DiamondDogs");
		map.put(1975, "YoungAmericans");
		map.put(1976, "StationToStation");
		map.put(1977, "Low\n1977 Heroes");
		map.put(1979, "Lodger");
		map.put(1980, "ScaryMonstersAndSuperCreeps");
		map.put(1983, "LetsDance");
		map.put(1984, "Tonight");
		map.put(1987, "NeverLetMeDown");
		map.put(1993, "BlackTieWhiteNoise");
		map.put(1995, "1.Outside");
		map.put(1997, "Earthling");
		map.put(1999, "Hours");
		map.put(2002, "Heathen");
		map.put(2003, "Reality");
		map.put(2013, "TheNextDay");
		map.put(2016, "BlackStar");
		
		int[] count = new int[50];
		count[0] = 1;
		count[2] = 1;
		count[3] = 1;
		count[4] = 1;
		count[5] = 1;
		count[6] = 2;
		count[7] = 1;
		count[8] = 1;
		count[9] = 1;
		count[10] = 2;
		count[12] = 1;
		count[13] = 1;
		count[16] = 1;
		count[17] = 1;
		count[20] = 1;
		count[26] = 1;
		count[28] = 1;
		count[30] = 1;
		count[32] = 1;
		count[35] = 1;
		count[36] = 1;
		count[46] = 1;
		count[49] = 1;
		
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			int S = scan.nextInt();
			int E= scan.nextInt();
			
			int num = 0;
			for (int j = S; j <= E; j++) {
				if (map.containsKey(j)) {
					num += count[j - 1967];
				}
			}
			
			System.out.println(num);
			
			for (int j = S; j <= E; j++) {
				if (map.containsKey(j)) {
					System.out.println(j + " " + map.get(j));
				}
			}
		}
		
		scan.close();
	}

}
