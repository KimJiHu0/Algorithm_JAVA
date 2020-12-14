package Algorithm011;

public class solution {
	
	// 입력된 수 N만큼 N열 형태 출력하기2
	// 입력값 : 4
	// 1 2 3 4
	// 8 7 6 5
	// 9 10 11 12
	// 16 15 14 13
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int num = 3;
		// 출력할 값 변수
		int count = 1;
		
		// int 타입의 이중배열을 선언
		int[][] arr = new int[num][num];
		
		// arr의 length만큼 for문을 돌려주는데
		for(int i = 0; i < arr.length; i++) {
			// i를 2로 나눴을 떄 나머지가 0이라면[첫번쨰줄, 세번쨰줄을 그대로 출력하기]
			if(i % 2 == 0) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = count;
					count++;
				}
			// 그게 아니라면 나머지 줄 거꾸로 출력하기
			} else {
				for(int j = arr[i].length-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
		}
		
		// 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
