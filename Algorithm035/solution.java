package Algorithm035;

public class solution {
	
	// 숫자 추출 재귀ver
	
	public static void main(String[] args) {
		
		int num = 123;
		
		num(num);
		
	}
	
	public static void num(int num) {
		// num = 123
		System.out.println("들어온 값 : " + num);
		
		// 123 / 10 == 12 이라 if문에 안들어오고
		// 12 / 10 == 1 이라 if문에 안들어오고
		// 1 / 10 == 0이기 떄문에 if문에 들어오고
		if(num / 10 == 0) {
			System.out.println("num / 10 = 0 " );
			// 3
			System.out.println(num);
			return ;
		}
		System.out.println("num : " + num);
		// 123 / 10 한 값을 다시 넣고,
		// 12 / 10 한 값을 다시 넣고,
		num(num/10); // => 12를 넣고, 1을 넣고,
		// 123 % 10  한 값인 3을 출력.
		// 12 % 10한 값인 2를 출력
		// 1 % 10한 값인 1 을 출력
		
		System.out.println("??"+num%10);
		// 12 % 10 의 값인 2
		// 
	}

}
