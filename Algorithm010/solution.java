package Algorithm010;

public class solution {
	
	// 입력된 수 N만큼 N열 형태 출력하기
	// [EX] 4면 4열 4행 형태로 16까지 출력
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int num = 5;
		// count를 세주기 위한 변수
		int cnt = 0;
		
		// 입력된 숫자가 4라면 . 4행 4열 크기 즉, 4*4 까지 출력해야하니까 1부터 num*num까지
		for(int i = 1; i <= num*num; i++) {
			// 1개 출력할때마다 cnt 증가
			cnt++;
			// i를 출력해주고, 
			System.out.printf("%3d", i);
			// cnt가 num이랑 같다면 ( 4번 출력하고 num과 동일하면 줄바꿈 해주기 위해 )
			if(cnt == num) {
				// cnt 초기화해주고
				cnt = 0;
				// 줄바꿈
				System.out.println();
			}
		}
		
	}

}
