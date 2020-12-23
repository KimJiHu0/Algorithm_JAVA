package Algorithm034;

public class solution {
	
	// 피보나치 재귀ver
	
	public static void main(String[] args) {
		// 받아온 수 값
		int num = 6;
		
		// 1부터 num까지 반복문 돌면서
		for(int i = 1; i <= num; i++) {
			// fibo라는 함수를 호출한다.
			System.out.print(fibo(i) + " ");
		}
	}
	
	public static int fibo(int n) {
		
		// 처음에 1이 들어오면
		// 아래의 if문에 들어가게 되어
		// 1 
		// 다음에 2가 들어오면 else가 되어
		// fibo(2-1) + fibo(2-2) => 1 1
		// 3이 들어오게 되면 fibo(3-1) + fibo(3-2)얘는 1 => 1 1 3
		// 4가 들어오게 되면 fibo(4-1) + fibo(4-2)
		// 5가 들어오게 되면 fibo(5-1) + fibo(5-2)
		// 6이 들어오게 되면 fibo(6-1) + fibo(6-2)
		if(n <= 1) {
			return n;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}

}
