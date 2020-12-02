package Level1;

import java.util.Arrays;

public class solution30 {

	// x만큼 간격이 있는 n개의 숫자

	/*
	 * [ 문제설명 ]
	 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음
	 * 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	 * 
	 * [ 제한조건 ] 
	 * x는 -10000000 이상, 10000000 이하인 정수입니다.
	 * n은 1000 이하인 자연수입니다.
	 * 
	 * [ 입출력 예 ]
	 * x  n  answer
	 * 2  5  [2,4,6,8,10]
	 * 4  3  [4,8,12]
	 * -4 2  [-4, -8]
	 */
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		int cnt = 2;
		
		for(int i = 0; i < n; i++) {
			answer[0] = x;
			if(i > 0) {
				answer[i] = answer[0] * cnt;
				cnt++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}

}
