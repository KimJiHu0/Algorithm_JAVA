package Level1;

public class solution16 {
	
	/*
	 * 두 정수 사이의 합 구하기
	 * 
	 * [문제설명]
	 * 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	 * 예를들어 a=3, b=5인경우 3+4+5 = 12이므로 12를 리턴합니다.
	 * 
	 * [제한조건]
	 * a와 b가 같은 경우 둘 중 아무 수나 리턴하세요.
	 * a와b는 -10,000,000이상 10,000,000이하인 정수입니다.
	 * a와b의 대소관계는 정해져있지 않습니다.
	 */
	
	public static long solution(int a, int b) {
		long answer = 0;
		
		// a : 3 / b : 5
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			// a : 5 / b : 3
			for(int i = a; i >= b; i--) {
				answer += i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

}
