package Algorithm033;

import java.util.Arrays;

public class solution {
	
	public static void main(String[] args) {
		// 입력 값
		int[][] arr = new int[][] {{0,0,0,0,0}, {0,0,1,1,0}, {0,0,0,0,1}, {0,0,0,0,0}, {0,0,1,0,0}};
		
		// 정답을 담을 값
		int[][] answer = new int[5][5];
		
		// arr의 길이만큼 이중 반복문 돌면서
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr[i][j]가 0이면
				if(arr[i][j] == 0) {
					// 정답을 담는 변수에 2를 담고
					answer[i][j] = 2;
				// 0이 아니면
				} else {
					// 1을 담아준다.
					answer[i][j] = 1;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(answer));
	}

}
