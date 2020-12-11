package Algorithm006;

public class solution_result {
	
	public static void main(String[] args) {
		
		// 최대공약수 구하기 => 답
		
		// 두 수를 지정
		int num1 = 12;
		int num2 = 18;
		
		// 큰 수와 작은 수를 구별하기 위해 선언
		int small = 0;
		int big = 0;
		
		// num1이 num2보다 크다면
		if(num1 > num2) {
			// 큰 수인 big에는 num1
			big = num1;
			// 작은 수인 small에는 num2
			small = num2;
		// 위의 조건문과 반대라면
		} else {
			// big에는 num2
			big = num2;
			// small에는 num1
			small = num1;
		}
		
		// 최대공약수
		int gcd = 1;
		
		// big과 small이 i로 나눴을 때 나누어 떨어진다면 gcd로 넣어주기 위함.
		for(int i = 1; i <= small; i++) {
			// big과 small이 모두 i로 나눴을 때 나누어 떨어진다면
			if(big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}

}
