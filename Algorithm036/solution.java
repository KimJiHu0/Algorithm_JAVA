package Algorithm036;

import java.util.Scanner;

public class solution {
	
	// 2진수로 변환하기 재귀ver
	
	// 전역변수 STR을 선언해준다.
	static String STR = "";
	
	public static void main(String[] args) {
		
		// 수를 입력하는 변수를 선언합니다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// jinSu함수를 호출합니다.(입력받은 값 파라미터로 넘깁니다.)
		jinSu(num);
		
	}
	
	public static void jinSu(int n) {
		
		// moc이라는 변수에 입력받은 n / 2한 값을 담고, 
		int moc = n / 2;
		// na라는 변수에 입력받은 n / 2의 나머지 값을 담는다.
		int na = n % 2;
		
		// 그리고 n에 moc을 대입해주고,
		n = moc;
		
		// moc이 0이라면 종료해주어야하기 떄문에 탈출조건을 걸어줬다.
		// 마짖막으로 moc이 0이 되어서 탈출조건에 들어오게 되면
		if(moc == 0) {
			// 마지막으로 STR이라는 변수에 na를 String으로 변환 후 담아주고,
			STR += String.valueOf(na);
			// 거꾸로 출력해준다.
			for(int i = STR.length()-1; i >= 0; i--) {
				System.out.print(STR.charAt(i));
			}
			return;
		// 위의 탈출조건을 들어가지 못한다면
		} else {
			// STR이라는 변수에 na값을 String으로 변환 후 담아주고,
			STR += String.valueOf(na);
			// 다시 jinSu라는 함수를 호출한다.
			jinSu(n);
		}
	}

}
