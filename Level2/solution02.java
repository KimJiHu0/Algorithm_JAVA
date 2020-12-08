package Level2;

public class solution02 {
	
	
	// 숫자의 표현
	
	/*
	    Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
		1 + 2 + 3 + 4 + 5 = 15
		4 + 5 + 6 = 15
		7 + 8 = 15
		15 = 15
		자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
	 */
	
	public static int solution(int n) {
		
		int answer = 0;
		
		// x부터 n번까지의 합을 더해줄 sum 변수를 선언
		int sum = 0;
		
		// 1부터 시작할 때, 2부터 시작할 떄 을 설정하기 위해 이중반복문을 돌렸다.
		for(int i = 1; i <= n; i++) {
			// j가 i부터해서 (1) 받아온 값까지(15) 반복하는데,
			for(int j = i; j <= n; j++) {
				// sum에 j를 계속 더해준다.
				sum += j;
				
				// 만일 sum이 받아온 값 n(15)와 같아진다면
				if(sum == n) {
					// answer를 ++해주고, 
					answer++;
					// 합계르르 초기화시킨 후
					sum = 0;
					// for문을 나간다 그럼 첫번쨰 큰 for문부터 시작하여, i가 ++된 2부터 시작이다.
					// 그럼 안에 작은 for문도 2부터 시작한다. [int j = i 초기식을 썼기 때문]
					break;
				// 만일 sum이 n보다 크다면
				}else if(sum > n) {
					// sum을 0으로 초기화 시켜주고, 바로 for문을 빠져나온다.
					sum = 0;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(15));
	}

}
