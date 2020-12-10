package Level2;

import java.util.Arrays;

public class solution04 {
	
	// N개의 최소공배수
	
	public static int solution(int[] arr) {
		int answer = 0;
		int i = 1;
		int cnt = 0;
		Arrays.sort(arr);
		
		
		// 무한반복 돌아준다.
		while(true) {
			
			// num이라는 변수에 arr의 마지막 번지 x 1을 한 값을 넣어준다.
			// i는 기본이 1이니까.
			int num = arr[arr.length-1] * i;
			
			// 배열에 담겨있는 값 중에서 가장 마지막 값을 뺴고 나머지 값을 for문 돌려준다.
			for(int j = 0; j < arr.length-1; j++) {
				// 만약에 num의 값 나누기 arr의 j번지의 나머지가 0이라면
				if(num % arr[j] == 0) {
					// cnt를 ++해준다.
					cnt++;
				}
			}
			
			// for문을 나와서 만약에 cnt가 arr의 길이-1이라면
			// 즉, 2,6,8,14 라면 => 길이는 4고, -1한 값이니 3.
			
			// 예시 1
			// 14 / 2 나머지 0 이라 cnt++
			// 14 / 6 나머지가 0이 아니라 패스
			// 14 / 8 나머지가 0이 아니라 패스
			
			// 예시 2
			// 168 / 2 => 나머지 0이라 cnt++ -> 1
			// 168 / 6 => 나머지 0이라 cnt++ -> 2
			// 168 / 8 => 나머지 0이라 cnt++ -> 3
			
			// cnt가 arr의 길이-1과 동일하기 때문에
			if(cnt == arr.length-1) {
				// answer에 num을 담아주고, while문을 break;
				answer = num;
				break;
			// 예시 1처럼 cnt가 1이라 arr의 길이-1보이랑 다르면
			} else {
				// cnt를 초기화시켜주고
				cnt = 0;
				// i를 ++해준다.
				// 그럼 14 * 1 이 num이었지만 다음에는 14*2가 num이되고 ....완전히 나누어질때까지 반복
				i++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,6,8,14}));
		System.out.println(solution(new int[] {1,2,3}));
	}

}
