package Level1;

public class solution29_01 {
		// 소수찾기

		// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)

		public static int solution(int n) {
			int answer = 0;
			
			// 어차피 1은 소수로 치지 않기 때문에 2부터 시작하면 된다.
			for(int i = 2; i <= n; i++) {
				// boolean 변수를 선언하고,
				boolean check = true;
				// j가 2부터 jxj가 i보다 작거나 같을때까지, j++해준다.
				for(int j = 2; j*j <= i; j++) {
					// 만일 i / j 의 나머지가 0이라면 
					if(i % j == 0) {
						// check를 false해주고
						check = false;
						// break해준다.
						break;
					}
				}
				// 만약 check가 true라면
				if(check) {
					// answer++해준다.
					answer++;
				}
			}
			
			return answer;
		}

		public static void main(String[] args) {
			System.out.println(solution(10));
			System.out.println(solution(5));
		}
}
