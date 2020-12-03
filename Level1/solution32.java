package Level1;

import java.util.Arrays;

public class solution33 {
	
	// 최대공약수와 최소공배수 구하기
	
	/*
	 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
	 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
	 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
	 */
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		int big = m;
		int small = n;
		
		// 최대공약수 구하기
		// 1부터 두수 중 작은수만큼 반복문을 돌리는데
		for(int i = 1; i <= small; i++) {
			// 만일 큰수/i의 나머지와 작은수/i의 나머지가 0일 때 
			if(big % i == 0 && small % i == 0) {
				// answer[0]에 i를 넣어준다.
				// 3과 12는 처음에 1로 나누었을 때 asnwer[0]에 들어가지만 그 후에 i가 3일 때 다시 answer[0]에 들어가기 때문에 3이 들어간다.
				answer[0] = i;
			}
		}
		
		// 최소공배수 구하기
		// 최소공배수를 구하는 공식은 (큰수 x 작은수) / 최대공약수 이다.
		answer[1] = (big * small) / answer[0];
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,12)));
		System.out.println(Arrays.toString(solution(2,5)));
		System.out.println(Arrays.toString(solution(3,8)));
	}

}
