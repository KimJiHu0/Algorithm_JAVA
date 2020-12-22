package Algorithm033;

public class solution_result {
	static final int SIZE = 5;
	static final int COLOR = 2;
	
	static int [][]map = 
			   {{0,0,0,0,0},
			   {0,0,1,1,0},
			   {0,0,0,0,1},
			   {0,0,0,0,0},
			   {0,0,1,0,0}};
	
	
	public static void color(int x, int y) {
		
		// map의 x,y번지가 1이 아니라면. 즉, 0이라면 색을 칠해야하기 때문에 COLOR로 덮어준다.
		if (map[x][y] != 1)
			map[x][y] = COLOR;
		
		// 왼쪽 => 왼쪽으로 갈 때 0보다 작아지면 안되서 조건을 걸어주고, 왼쪽에 있는게 2가 아니거나 1이 아니라면. 즉, 0이라면 칠해주고,
		if (x - 1 >= 0 && map[x-1][y] != COLOR && map[x-1][y] != 1)
			color(x-1, y);
		// 오른쪽 => 오른쪽으로 갈 떄 사이즈를 넘어가면 안되서 조건을 걸어주고, 오른쪽이 2가 아니거나 1이 아니라면. 즉, 0이라면 칠해주고,
		if (x + 1 <= SIZE-1 && map[x+1][y] != COLOR && map[x+1][y] != 1)
			color(x+1, y);
		// 아래 => 아래로 갈 떄 사이즈를 벗어나면 안되기 때문에 조건을 걸어주고, 아래가 2가 아니거나 1이 아니라면. 즉, 0이라면 칠해주고,
		if (y + 1 <= SIZE-1 && map[x][y+1] != COLOR && map[x][y+1] != 1)
			color(x, y+1);
		// 위 => 위로 갈 때 0을 벗어나면 안되기 때문에 조건을 걸어주고 2가 아니거나 1이 아니라면. 즉, 0이라면 칠해준다.
		if (y - 1 >= 0 && map[x][y-1] != COLOR && map[x][y-1] != 1)
			color(x, y-1);
		
		
	}
	
	public static void main(String[] args) {

		// 색이 칠해지기 전 출력을 해주고
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		// 색을 칠해준 후 출력을 해준다.
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
