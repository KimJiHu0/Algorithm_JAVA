package Level1;

public class solution19 {
	
	/*
	 * 약수의 합
	 * 
	 * [문제설명]
	 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	 * 
	 * [입출력 예]
	 * n : 12 / return : 28
	 * n : 5 / return : 6
	 */
	
	public static int solution(int n) {
		int answer = 0;
		
		// 받아온 정수 n만큼 for문을 돌면서
		for(int i = 1; i <= n; i++) {
			// 만일 n%1의 나머지가 0일 때(나누어 떨어질 때)
			if(n%i == 0) {
				// answer에 n 나누기 i한 값을 더해준다.
				answer += n/i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(12));
		System.out.println(solution(5));
	}

}
