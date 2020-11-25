package Level1;

import java.util.Arrays;

public class solution10 {
	/*
	 * [문제설명]
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	 * 
	 * [입출력 예]
	 * s : Zbcdefg / return : gfedcbZ
	 */
	public static String solution(String s) {
		String answer = "";
		
		// 받아온 String값 s를 ""로 잘라서 String배열에 담아주면
		// ["Z", "b", "c", "d", "e", "f", "g"] 로 담긴다.
		String[] arr = s.split("");
		
		// 그 애를 정렬해준다. 그럼 결과값은
		// ["g", "f", "e", "d", "c", "b", "Z"] 로 담긴다.
		Arrays.sort(arr);

		// 이를 answer이라는 String타입의 변수에 하나씩 담아준 후 return
		for(int i = arr.length-1; i >= 0; i--) {
			answer += arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
