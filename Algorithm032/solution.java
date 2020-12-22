package Algorithm032;

public class solution {
	
	// 시작과 끝의 합 재귀ver
	
	public static void main(String[] args) {
		
		// 시작 값
		int first = 1;
		// 마지막 값
		int second = 3;
		
		// sum이라는 함수에 시작변수, 마지막 변수를 담아서 보낸다.
		System.out.println(sum(first, second));
	}
	
	// 시작, 마지막 변수를 a, b로 받아온다.
	public static int sum(int a, int b) {
		// 시작 변수의 값이 마지막 변수의 값과 동일해진다면
		if(a == b) {
			// b를 return하게 된다.
			return b;
		}
		// 아니라면 a + sum(a+1, b) 를 리턴하여 시작값과 끝값을 다시 넣어서 함수를 재호출 한다..
		return a + sum(a+1, b);
		// 1, 3이 들어왔다면
		// 1 + sum(2, 3)
		//		2 + sum(3, 3)
		//			start와 end가 동일하여 b를 return해서 3
		// 1 + 2 + 3이 된다.
	}

}
