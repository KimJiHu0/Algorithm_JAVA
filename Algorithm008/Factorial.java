package Algorithm008;

public class Factorial {
	
	public static void main(String[] args) {
		
		// num은 x팩토리얼을 구하기 위한 변수
		int num = 5;
		// answer는 결과를 담아줄 변수
		int answer = 1;

		// 0부터 num까지 i를 ++해주면서 반복문 돌려준다.
		// 5 팩토리얼은
		// 5-1 * 5-2 * 5-3 * 5-4 의 값이다.
		for(int i = 0; i < num; i++) {
			// answer에 x팩토리얼 값 num - i를 계속 곱해준다.
			// 그렇게되면 answer = answer * 5 - 1
			// answer = answer * 5 - 2
			// answer = answer * 5 - 3
			// answer = answer * 5 - 4
			// 의 총 값이 된다.
			answer *= num-i;
		}
		System.out.println(answer);
	}
}
