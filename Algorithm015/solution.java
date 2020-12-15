package Algorithm015;

public class solution {
	
	// 입력된 숫자의 개수를 출력하라
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,2,3,2};

		// arr의 index에 존재하는 값이 몇번 나왔는지 확인하기 위한 변수
		int cnt = 0;
		// arr의 index에 존재하는 값과 check와 비교하여 cnt를 ++해주기 위한 변수
		int check = 0;
		
		// while 무한반복
		while(true) {
			// arr의 length만금 반복문을 돌리며
			for(int i = 0; i < arr.length; i++) {
				// arr의 i번지와 check랑 같다면
				if(arr[i] == check) {
					// cnt를 증가해주고,
					cnt++;
				}
			}
			// check가 몇번 나왔는지 출력
			System.out.println(check + " : " + cnt);
			// check를 ++,
			check++;
			// cnt를 0으로 초기화.
			cnt = 0;
			
			// check를 9까지 비교해야해서 10이되면 while문 break
			if(check == 10) {
				break;
			}
		}
		
	}

}
