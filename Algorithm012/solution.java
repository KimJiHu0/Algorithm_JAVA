package Algorithm012;

public class solution {
	
	// 입력된 수 N만큼 N열 형태 출력하기3
	// 입력값 : 4
	// 1 5 9 13
	// 2 6 10 14
	// 3 7 11 15
	// 4 8 12 16
	
	public static void main(String[] args) {
		
		// 입력받을 수
		int num = 5;
		// 출력해줄 수
		int count = 1;
		
		// int타입의 이중 배열 선언
		int[][] arr = new int[num][num];
		
		// arr의 길이만큼 반복문 돌리고,
		for(int i = 0; i < arr.length; i++) {
			// arr의 i번지의 길이만큼 반복문을 돌리면서
			for(int j = 0; j < arr[i].length; j++) {
				// arr의 i,j번지에 count를 넣어준 후에,
				arr[i][j] = count;
				// 다음 숫자는 count에 num만큼 더해준 수를 담아준다.
				// [1,5,9,13]
				count += num;
			}
			// 그 후에 count를 i + 2를 해주는데 그 이유는
			// 원래는 count를 2로 초기화를 시켜줘야하는데 그럼 첫번쨰 두번쨰는 잘 출력되지만 3번쨰 줄에서 [2,6,10,14]만 출력되어서
			// 맨 처음에 i가 0일 떄 첫번쨰 줄이 출력되었다.
			// 첫번쨰 줄에는 1부터 시작, 두번쨰 줄에는 2부터, 세번째 줄에는 3부터, 네번쨰 줄에는 4부터 시작하므로
			// count는 1부터 시작했으니 다음에는 2가 되어야 하여서 현재 i가 0이니까 0+2 해주어서 count는 2부터 시작하게 되고,
			// 세번째 줄에는 3부터 시작하는데, i가 1이 되었으니 1+2해서 3부터 시작한다.
			count = i + 2;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
