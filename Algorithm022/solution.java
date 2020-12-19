package Algorithm022;

public class solution {
	
	// 팰린드롬
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int[] nArr = new int[] {1,2,3,3,3,2,1};
		
		// ++해줄 cnt변수 선언
		int cnt = 0;
		
		// nArr의 길이 / 2 만큼 반복문을 돌아줍니다.
		for(int i = 0; i < nArr.length/2; i++) {
			// 만일 nArr의 번지와(맨 처음과) nArr의 nArr.length-1 - i(맨뒤)가 같다면
			if(nArr[i] == nArr[nArr.length-1 - i]) {
				// cnt를 ++해줍니다.
				// 그 다음 i가 1입니다.
				// 그럼 nArr[1]와 nArr[7-1-1]과 즉, nArr[1] == nArr[5], 그 다음은 nArr[2] == nArr[4] ... 으로갑니다.
				cnt++;
			}
		}
		// 만일 cnt가 nArr의 /2 값과 동일하면
		if(cnt == nArr.length/2) {
			// true
			System.out.println(true);
		// 아니라면
		} else {
			// falseㅇ
			System.out.println(false);
		}
		
	}

}
