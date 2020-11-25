package Level1;

public class solution13 {
	
	/*
	 * 문자열을 정수로 바꾸기
	 * 
	 * [문제설명]
	 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수 solution을 완성하시오.
	 * 
	 * [제한조건]
	 * s의 길이는 1이상 5이하입니다.
	 * s의 맨앞에는 부호가 올 수 있습니다.
	 * s는 부호와 숫자로만 이루어져 있습니다.
	 * s는 "0"으로 시작하지 않습니다.
	 * 
	 * [입출력 예]
	 * str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
	 * str은 부호와 숫자로만 구성되어 있고, 잘못된 값이 입력된느 경우는 없습니다.
	 */
	
	public static int solution(String s) {
		int answer = 0;
		
		// String값을 int로 형변환 해주는 Integer.parseInt();를 사용하면 된다.
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("-1234"));
		System.out.println(solution("1234"));
	}

}
