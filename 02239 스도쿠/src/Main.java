import java.util.*;
public class Main {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] map = new int[9][9];
		List<Integer> zero = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < 9; j++) {
				int num = Integer.parseInt(line.substring(j, j+1));
				if (num == 0) {
					zero.add(10*i + j);
				} else {
					map[i][j] = num;
				}
			}
		}
		
		back(0, map, zero);
		
		scan.close();
	}
	
	public static boolean promising(int y, int x, int[][] map) {
		int num = map[y][x];
		
		for (int i = 0; i < 9; i++) {
			if (map[i][x] == num && i != y) {
				return false;
			}
		}
		for (int j = 0; j < 9; j++) {
			if (map[y][j] == num && j != x) {
				return false;
			}
		}
		
		for (int i = 3*(y/3); i < 3*(y/3+1); i++) {
			for (int j = 3*(x/3); j < 3*(x/3+1); j++) {
				if (map[i][j] == num && i != y && j != x) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void back(int index, int[][] map, List<Integer> zero) {
		for (int i = 1; i < 10; i++) {
			int loc = zero.get(index);
			int y = loc / 10;
			int x = loc % 10;
			
			map[y][x] = i;
			if (promising(y, x, map)) {
				if (index == zero.size()-1) {
					if (count < 1) {
						count += 1;
						print(map);
						System.exit(0);
					}
				} else {
					back(index+1, map, zero);
				}
			}
			map[y][x] = 0;
		}
	}
	
	public static void print(int[][] map) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 8) {
					System.out.print(map[i][j]);
				} else {
					System.out.print(map[i][j]);
				}
			}
			if (i < 8) {
				System.out.println();
			}
		}
	}
}
