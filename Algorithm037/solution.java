package Algorithm037;

public class solution {
	
	// 단지수 출력 재귀ver
	
	static final int SIZE = 5;
	static final int APART = 1;
	
	// 단지수를 세기 위한 변수
	static int apartCnt = 0;
	// 각 단지의 세대수를 저장하기 위한 배열
	static int []houseHold = new int[10];

	static int[][] map = {
			{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,0},
			{1,1,0,0,0},
			{1,1,0,1,1}
	};
	public static void main(String[] args) {
		// map을 돌면서
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				// 1일때, 아파트가 존재하는 단지수를 ++하기 위해.
				if(map[i][j] == 1) {
					// 1이 있는 곳의 상하좌우를 체크하여 몇개인지 세보기 위해 함수호출
					check(i, j, apartCnt);
					apartCnt++;
				}
			}
		}
		
		// 최종 아파트 단지 출력하고,
		System.out.println("단지수 : " + apartCnt);
		// 세대수를 저장한 것을 불러와 출력
		for(int i : houseHold) {
			System.out.print(i + " ");
		}
	}
	
	public static void check(int x, int y, int cnt) {
		
		// 넘어온 해당 번지수의 값을 0으로 바꿔줘야한다.
		map[x][y] = 0;
		// 하나의 단지수에 1단지개 아파트가 몇개인지 확인하기 위해 cnt번지수의 값을 ++한다.
		houseHold[cnt]++;
		
		// 사이즈를 벗어나지 않고, 상하좌우가 1이라면 다시 함수를 호출하기 위한 조건문들
		if(x-1 >= 0 && map[y][x-1] == APART){
			check(y, x-1, cnt);
		}
		if(x + 1 <= SIZE-1 && map[y][x+1] == APART) {
			check(y, x+1, cnt);
		}
		if(y + 1 <= SIZE-1 && map[y+1][x] == APART) {
			check(y+1, x, cnt);
		}
		if(y - 1 >= 0 && map[y-1][x] == APART) {
			check(y-1, x, cnt);
		}
		
	}

}
