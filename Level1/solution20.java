package Level1;

import java.util.Arrays;

public class solution20 {

	/*
	 * 자리수 더하기
	 * 
	 * [문제설명]
	 * 자연수 N이 주어지면 N의 각 자리수를 합을 구해서 return하는 함수 solution을 완성하세요.
	 * 
	 * [입출력 예]
	 * N : 123 / return : 6
	 */
	
	public static int solution(int n) {
		int answer = 0;
		
		// 받아온 정수 n을 String.valueOf로 String타입으로 형변환을 해준다.
		String str = String.valueOf(n);
		// str의 길이만큼 for문을 돌려준다.
		for(int i = 0; i < str.length(); i++) {
			// answer에 str의 i번지에 있는 값을 int형태로 형변환 해주는데, charAt은 char형태이기 때문에 +"" 를 붙여 String 타입으로 바꿔준다.
			answer += Integer.parseInt(str.charAt(i)+"");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
	
}
