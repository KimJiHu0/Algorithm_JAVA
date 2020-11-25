package Level1;

public class solution14 {
	
	/*
	 * 문자열 다루기 기본
	 * 
	 * [문제설명]
	 * 문자열 S의 길이가  4혹은 6이고, 숫자로만 구성돼있는지 확인하는 함수, solution을 완성하세요.
	 * 예를들어 s가 "a234"면 false, "1234"면 true를 리턴하면 됩니다.
	 * 
	 * [제한조건]
	 * s는 길이 1이상, 8이하인 문자열입니다.
	 */
	
	public static boolean solution(String s) {
		boolean answer = true;
		
		// 1. 87.5점 
		// => 테스트 5,6번 오류
		try {
			// s를 int 타입으로 형변환 해주는데 분명히 오류가 나기 때문에
			// try catch로 잡아준다.
			Integer.parseInt(s);
			// 만일 형변환이 성공하고 오류가 나지 않으면 answer을 true로 바꿔주고,
			answer = true;
		} catch (NumberFormatException e) {
			// 오류가 났다면 answer에 false를 담아서 return한다.
			answer = false;
		}
		
		//2. 100점
		
		// regx는 정규식표현을 담아준 String이다.
		// 문자열로 처음 시작과 끝이 숫자이고, 길이의 제한이 없다는 것을 의미한다.
		String regx = "^[0-9]*$";
		// 만일 s의 길이가 4거나 6일때
		if(s.length() == 4 || s.length() == 6) {
			// 그리고 정규식 표현법에 맞는다면
			if(s.matches(regx)) {
				// answer을 true로, 
				answer = true;
			} else {
				// 그렇지 않다면 answer를 false로,
				answer = false;
			}
		} else {
			// 애초에 s의 길이가 4거나 6이지 않는다면 answer를 false로 바꿔준다.
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}

}
