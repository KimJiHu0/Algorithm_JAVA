package Algorithm026;

public class solution {
	
	// 상수
	
	// 상수는 수를 거꾸로 읽는다. 734와 893을 거꾸로 읽어서 더 큰수를 출력하세요
	
	public static void main(String[] args) {
		
		int num1 = 734;
		int num2 = 893;
		
		// num1을 거꾸로 출력하기
		
		// num1을 String으로 변경해준다.
		String inputNum1 = String.valueOf(num1);
		// 결과를 담을 String변수 answer1 선언
		String answer1 = "";
		// 반복문을 돌아주는데, inputNum1부터 0까지 거꾸로 answer1에 더해준다.
		for(int i = inputNum1.length()-1; i >= 0; i--) {
			answer1 += inputNum1.charAt(i);
		}
		
		// num2를 String으로 변경해준다.
		String inputNum2 = String.valueOf(num2);
		// 결과를 담을 String변수 answer2 선언
		String answer2 = "";
		// 반복문을 돌아주는데 inputNum2부터 0까지 answer2에 더해준다.
		for(int i = inputNum2.length()-1; i >= 0; i--) {
			answer2 += inputNum2.charAt(i);
		}
		
		// String값인 answer1과 answer2의 값을 Integer로 형변환 후 answer1가 더 크다면
		if(Integer.parseInt(answer1) > Integer.parseInt(answer2)) {
			// answer1 출력
			System.out.println(answer1);
		// 아니라면
		} else {
			// answer2 출력
			System.out.println(answer2);
		}
		
		System.out.println("=================");
		
		
		
	}

}
