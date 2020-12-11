package Algorithm007;

import java.util.Scanner;

public class solution {
	
	// 입력된 수가 소수인지 판별하시오.
	
	// 소수란 1과 나 자신으로밖에 나누어 떨어지지 않는 수를 의미합니다.
	
	public static void main(String[] args) {
		
		// 수를 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		// 나누어 떨어질 때 ++ 해줄 cnt 변수를 선업합니다.
		int cnt = 0;
		
		// 1부터 num까지 for문을 돌아주며
		for(int i = 1; i <= num; i ++) {
			// num / i의 나머지가 0 이라면
			if(num % i == 0) {
				// cnt를 ++해줍니다.
				cnt++;
			}
		}
		
		// cnt가 2라면[1부터 입력한 숫자까지 나눴을 때 나누어 떨어지는 수가 1과 자기 자신밖에 없다면] => 소수
		if(cnt == 2) {
			System.out.println(num + "은 소수입니다.");
		// 아니라면 소수x
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		
	}

}
