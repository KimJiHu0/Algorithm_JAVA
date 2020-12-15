package Algorithm019;

public class solution {
	
	// 거듭제곱
	
	public static void main(String[] args) {
		
		int num = 10;
		int up = 3;
		
		// 1.
		// Math.pow 메소드를 이용하여 거듭제곱을 구해준다.
		System.out.println((int)Math.pow(num, up));
		
		// 2.
		// sum이라는 합을 담아주는 변수 선언한다.
		int sum = 1;
		// up만큼 반복문을 돌아준다. => 거듭제곱만큼
		for(int i = 0; i < up; i++) {
			// sum에 num을 계속 곱해준다.
			sum *= num;
		}
		System.out.println(num + "의" + up + "승 = " +sum);
		
	}

}
