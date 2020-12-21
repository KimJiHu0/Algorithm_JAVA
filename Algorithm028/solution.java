package Algorithm028;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// 10진수를 n진수로
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.print("몇진수로 나눌까요 : ");
		int jinsu = sc.nextInt();
		
		sc.close();
		
		// 10 => A, 11 => B, 12 => C ... 15 => F 를 넣어주기 위해 char배열을 선언.
		char[] answer = new char[100];
		// answer의 index를 표기해주기 위한 변수 i
		int i = 0;
		
		// num이 0보다 작아지면 while문이 종료됩니다.
		while(num > 0) {
			// tmp라는 변수에 num % jinsu의 값을 담아주고,
			int tmp = num % jinsu;
			
			// tmp가 10~15라면 / 즉 위처럼 A~F라면
			if(tmp >= 10 && tmp <= 15) {
				// answer의 i번지에 'A' => 10 + tmp가 10이라면 -10을 해줘서 그대로 A가 answer[i]로 들어가고,
				// tmp가 11(B)라면 11 - 10이 1이고 , 'A'에 1이 더해져서 B가 됩니다.
				answer[i] = (char)('A' + (tmp-10));
			// 그렇지 않으면
			} else {
				// answer의 i번지에 tmp를 char형으로 변환 후 넣어줍니다.
				// '0'을 붙여준 이유는 int값을 String값으로 변환해주기위해 +"" 를 붙여주는 것과 같은 의미입니다.
				answer[i] = (char)('0'+tmp);
			}
			// num에는 num / jinsu의 값을 넣어주고 i++해줍니다.
			num /= jinsu;
			i++;
		}
		
		for(; i >= 0; i--) {
			System.out.print(answer[i]);
		}
		
	}

}
