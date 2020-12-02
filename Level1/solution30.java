package Level1;

public class solution31 {

	// 정수 제곱근 판별

	/*
	 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 */

	public static long solution(long n) {
		long answer = 0;

		// 만약에 입력받은 값 121의 2분의1승(11) 나누기 1의 나머지가 0이 아니라면 => 제곱근이 아니다.
		if (Math.pow(n, 0.5) % 1 != 0) {
			// return -1;
			return -1;
		// 제곱근이라면
		} else {
			// answer에 입력받은 값의 제곱근을 구한 것의 +1을 한후 제곱을 해준다.
			return answer = (long) Math.pow(Math.pow(n, 0.5) + 1, 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution(121)); // => 11
		System.out.println(solution(3)); // => -1
	}

}
