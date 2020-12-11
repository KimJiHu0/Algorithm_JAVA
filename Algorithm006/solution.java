package Algorithm006;

import java.util.Arrays;

public class solution {
	
	// 최대공약수 구하기 => 내가 직접 푼 코드
	// 완전탐색
	
	public static void main(String[] args) {
		
		// nArr은 2개의 수를 대입합니다. 순서는 상관 없습니다.
		int[] nArr = new int[] {18,9};

		// nArr을 오름차순으로 정렬합니다.
		Arrays.sort(nArr);
		
		// answer는 답을 의미하는 변수입니다.
		int answer = 0;
		// num은 nArr의 값들을 나눠줄 값입니다.
		int num = 1;
		// count는 nArr을 num으로 나눴을 때 둘 다 나눠질 떄를 구분하기 위해 선언했습니다.
		int count = 0;
		
		// 무한 반복을 돕니다.
		while(true) {
			// nArr의 값들만큼 반복문을 돌면서
			for(int i = 0; i < nArr.length; i++) {
				// nArr의 i번지 / num이 0일 경우에는
				if(nArr[i] % num == 0) {
					// count를 ++해줍니다.
					count++;
				}
			}
			
			// 반복문이 끝나면 이제 if문을 접하게 됩니다.
			// count가 2이라면 [nArr의 두 수 모두 num으로 나눴을 때 나누어 떨어진다면]
			if(count == 2) {
				// 답을 출력해줄 answer라는 변수에 num을 대입합니다.
				answer = num;
				// 그리고 num을 ++해준 후,
				num++;
				// count를 0으로 초기화 시킵니다.
				count = 0;
			}
			
			// count가 1 또는 0이라면 [nArr의 값 중 하나만 나누어 떨어지거나, 둘 다 떨어지지 않을 경우]
			else if(count == 1 || count == 0) {
				// num을 ++해주고
				num++;
				// count를 0으로 초기화 하는 것으로 끝냅니다.
				count = 0;
			}
			
			// 위의 if~else if문이 끝나면 이 if문으로 접하게 되는데, num을 계속 ++해주다가
			// nArr에서 가장 큰 값인 nArr의 1번지의 값과 num의 값이 동일하다면
			if(num == nArr[1]) {
				// while문을 끝내줍니다.
				break;
			}
		}
		System.out.println(answer);
	}

}
