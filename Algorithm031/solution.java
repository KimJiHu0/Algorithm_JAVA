package Algorithm031;

public class solution {
	
	// 팩토리얼 재귀ver
	
	// 5팩토리얼 => 5 x 4 x 3 x 2 x 1 => 120
	
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(fact(num));
	}
	
	public static int fact(int n) {
		
		// 여기로 num의 숫자가 들어온다.
		// n = 5
		
		if(n <= 1) {
			return n;
		} else {
			return fact(n-1)*n;
		}
	}

}
