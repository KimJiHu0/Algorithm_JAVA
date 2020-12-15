package Algorithm013;

public class solution {

	// 입력된 수 N만큼 N열 형태 출력하기4
	
	// 1 2 3 4
	// 2 4 6 8
	// 3 6 9 12
	// 4 8 12 16
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int n = 5;
		// 입력 받은 수만큼 이중배열 선언
		int[][] arr = new int[n][n];
		
		// 배열에 넣어줄 값 선언
		int num = 1;
		// plus해줄 값 선언
		int plus = 1;
		
		// arr의 i, j 만큼 반복문 돌아주면서
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// 세로로 가기 위해서 arr의 [j][i]번지에 num을 대입해주고,
				arr[j][i] = num;
				// num = num + plus
				// num = 1 + 1;
				// 즉, 처음에는 +1씩 해서 세로로 진행
				num += plus;
			}
			// 두번째 세로는 +2 씩 해주기 위해서 plus를 ++.
			// 세번째 세로는 +3 씩, 
			// 네번째 세로에는 +4씩
			plus++;
			// num은 두번째 세로에 2부터 시작하기 때문에 i는 현재 0이고 0 + 2, 다음은 1 + 2 해서 세번쨰 세로줄은
			// 3부터, 네번째 세로줄은 4부터 시작하기 위해서 선언
			num = i + 2;
		}
		
		// 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
