package Algorithm009;

public class solution {
	
	// 입력된 수의 각 자릿수 합을 구하시오.
	
	// 방법이 되게 여러가지 있음.
	
	// int타입의 변수에 담긴 값의 자리수를 하나씩 뽑아내기 위해서는
	// String형태로 바꾸어서 charAt을 이용해도 되며,
	// String[] 로 해도 되고, int[]로 해도된다.
	
	public static void main(String[] args) {
		
		// String 변수를 이용한 첫번째 방법
		int num = 1232;
		
		String nStr = String.valueOf(num);
		
		int answer = 0;
		for(int i = 0; i < nStr.length(); i++) {
			answer += Integer.parseInt(nStr.charAt(i)+"");
		}
		System.out.println(answer);
		System.out.println("=================================");
		
		// 2번째 방법
		
		int inputNum = 1232;
		int accSum = 0;
		
		while(inputNum > 0) {
			// accSum에 inputNum / 10의 나머지를 더하고,
			accSum += inputNum % 10;
			// inputNum에는 inputNum / 10 의 몫을 담아준다. 이를 반복
			inputNum /= 10;
		}
		System.out.println(accSum);
		
		
	}

}
