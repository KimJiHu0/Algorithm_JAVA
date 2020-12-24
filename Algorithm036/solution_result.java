package Algorithm036;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		decToBin(input);
	}
	
	// 17
	// 8 ... 1
	// 4 ... 0
	// 2 ... 0
	// 1 ... 0
	// 0 ... 1
	
	// 10001
	
	// [ 탈출조건 ]계속 2로 나누다가 몫이 0이되면 탈출하면 된다.
	
	public static void decToBin(int N) {
		
		// 처음 들어온 수 17
		// 두번째로 8
		// 세번쨰로4
		// 네번쨰로2
		// 마지막 1
		
		// 탈출조건
		if(N == 1) {
			// 마지막으로 N을 출력해줘야한다.
			// 마지막으로 N을 출력해줘서
			System.out.print(N);
			// 재귀함수 종료
			return;
		}
		// 17/2를 재귀함수를 통해 호출하고,
		// 8/2를 재귀함수를 톹해 호출하고,
		// 4/2를 재귀함수를 통해 호출하고
		// 2/2를 재귀함수를 통해 호출하고
		decToBin(N/2);
		
		// 17%2의 값을 호출한다. => 1
		// 8%2의 값을 호출한다. => 0
		// 4%2의 값을 호출한다. => 0
		// 2%2의 값을 호출한다. => 0
		System.out.print(N%2);
		
		// 총 10001인데 거꾸로 순차적으로 출력한다.
	}

}
