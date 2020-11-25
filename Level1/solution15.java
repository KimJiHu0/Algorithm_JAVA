package Level1;

public class solution15 {
	
	/*
	 * 가운데 글자 가져오기
	 * 
	 * [문제 설명]
	 * 단어 s의 가운데 글자를 반환하는 함수, solutuion을 완성하세요.
	 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	 * 
	 * [제한사항]
	 * s는 길이가 1이상, 100이하 String입니다.
	 * 
	 * [입출력 예]
	 * s : "abcde" / return : "c"
	 * s : "qwer" / return : "we"
	 */
	
	public static String solution(String s) {
		String answer = "";
		
		// 받아온 String s의 길이가 홀수일 때
		if(s.length() % 2 != 0) {
			// String배열 str에 ""를 기준으로 split해준 값을 넣어준 후
			String[] str = s.split("");
			// answer에 str배열에 s의 길이 나누기 2의 값의 번지를 담아준다.
			answer = str[s.length()/2];
			
		// 받아온 String s의 길이가 짝수일 때
		} else {
			// String str에 ""를 기준으로 자른 값을 담아준 후
			String[] str = s.split("");
			// answer에 str배열에 s길이 나누기 2에서 -1한 번지수를 넣어주고, 
			answer += str[s.length()/2 - 1];
			// str에 str배열에 s길이 나누기 2한 값을 번지수에 넣어준다.
			answer += str[s.length()/2];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcde")); // => 5
		System.out.println(solution("qwer")); // => 4
		System.out.println(solution("asdfgh")); // => 6
	}

}
