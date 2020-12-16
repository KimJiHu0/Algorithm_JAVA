package Algorithm020;

public class solution {
	
	// 3 6 9 게임
	
	// 3 6 9 13 16 19 23 26 29 30 31 32 33 34
	
	public static void main(String[] args) {
		
		// 3 6 9가 들어있는 갯수를 알려주기 위한 변수
		int cnt = 0;

		// 100까지 반복문을 돌아주는데
		for(int i = 1; i <= 100; i++) {
			// num이라는 String변수에 i값을 형변환 하여 담아준 다음에,
			String num = String.valueOf(i);
			// num의 길이만큼 반복문을 돌아준다.
			for(int j = 0; j < num.length(); j++) {
				// 만일 num의 j번지가 3, 6, 9라면 
				if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					// cnt를++해준다.
					// 두자리 수에서 둘 다 3 6 9가 포함되어 있다면 cnt++은 2번 된다.
					cnt++;
				}
			}
			// 만일 cnt가 1이라면 3 6 9가 한번밖에 안들어간다는 의미다.
			if(cnt == 1) {
				// 짝을 출력해주고, cnt는 0으로 초기화
				System.out.print("짝("+i+") ");
				cnt = 0;
			// cnt가 2라는 것은 369가 2번 들어간다는 것이다.
			} else if(cnt == 2) {
				// 짝짝을 출력 후
				System.out.print("짝짝(" + i + ") ");
				// cnt 초기화
				cnt = 0;
			// 위의 조건 둘 다 만족하지 못한다면 그냥 출력해준다.
			} else {
				System.out.print(i + " ");
			}
		}
		
	}

}
