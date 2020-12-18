package Level2;

import java.util.Arrays;

public class solution08 {
	
	// 최솟값 만들기
	
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		
		// 받아온 A와 B의 값을 sort로 정렬해준다.
		
		Arrays.sort(A); // [1,2,4]
		Arrays.sort(B); // [4,4,5]
		
		// idx라는 변수는 B의 index를 정해주기 위핸 변수이다.
		int idx = B.length-1;
		
		// A의 길이만큼 반복문을 돌리는데,
		for(int i = 0; i < A.length; i++) {
			// answer에다가 A의 i번지 * B의 idx번지 값을 더해준다.
			answer += A[i] * B[idx];
			// 그 후 idx는 --를 해준다.
			idx--;
		}
		
		// 가장 최소의 값을 구하기 위해서는 A배열에서 가장 작은 수와 B배열에서 가장 큰 수를 곱해주어 answer에 더해주면 된다.
		// sort는 오름차순이기 때문에 A배열에서는 순차적으로 ++해서 index에 존재하는 값을 찾아오면 되고,
		// B배열에서는 순차적으로 --해서 index에 존재하는 값을 찾아오면 된다.
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,4,2}, new int[] {5,4,4}));
		System.out.println(solution(new int[] {1,2}, new int[] {3,4}));
		
	}

}
