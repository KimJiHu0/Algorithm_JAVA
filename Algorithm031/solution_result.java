package Algorithm031;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		// 수를 입력받기 위한 int변수를 선언한다.
		int input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		// 결과를 담을 answer 변수를 선언합니다.
		int answer = 0;
		
		// answer 에 fact(input)의 값을 담아줍니다.
		answer = fact(input);
		
		// 그리고 answer를 출력합니다.
		System.out.println(answer);
	}
	
	public static int fact(int n) {

		// 만일 3이 들어오게 되면 n : 3
		
		// 3은 1이 아니라서
		if(n == 1) {
			return 1;
		}
		return n * fact(n-1);
		// 3 * fact(3-1)
		//		2 * fact(2-1)
		// n이 1이 되어서 1을 반환한다. 1
		
		// 3 * 2
		//		2 * 1
		// 최종적으로 올라가면 3 * 2 * 1 이 되어서 6을 반환한다.
	}

}
