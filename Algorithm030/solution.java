package Algorithm030;

public class solution {
	
	// 더하기 & 마이너스 
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int inputNum = 9;
		
		// 1~9까지 반복문을 돌아주는데
		for(int i = 1; i <= inputNum; i++) {
			// i가 9 이하면
			if(i < inputNum) {
				// 이 부분 실행
				
				// i가 2로 나눴을 때 나머지가 0이 아니라면 / 홀수라면
				if(i % 2 != 0) {
					// i 뒤에 +를 붙여주고, 
					System.out.print(i + " + ");
				// i가 2로 나눴을 때 나머지가 0이라면 / 짝수라면
				} else {
					// i 뒤에 -를 붙여준다.
					System.out.print(i + " - ");
				}
			// i가 9라면
			} else {
				// 그냥 i만 출력해준다.
				System.out.print(i);
			}
		}
	}

}
