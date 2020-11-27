package Level1;

public class solution27 {

	// 하샤드 수

	// 양의 정수 x가 하샤드 수려면 x자릿수의 합으로 x가 나누어져야합니다.
	// 예를들어 18의 자릿수 합은 1+8 = 9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
	// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수 solution을 완성하세요

	// [입출력 예]
	// arr : 10 / return : true
	// arr ; 12 / return : true
	// arr : 11 / return : false
	// arr : 13 / return : false

	public static boolean solution(int x) {
		boolean answer = true;
		
		// x를 String으로 변환 후
		String str = String.valueOf(x);
		// 한글자씩 모두 nArr에 담아준다.
		String[] nArr = str.split("");
		
		int sum = 0;
		
		// nArr의 길이만큼 for문을 돌아주며
		for(int i = 0; i < nArr.length; i++) {
			// 미리 선언한 sum에 nArr의 i번지를 int로 변환 후 더해준다.
			sum += Integer.parseInt(nArr[i]);
			// 만일 받아온 값 x / sum의 나머지가 0이라면
			if(x % sum == 0) {
				// answer은 true
				answer = true;
			} else {
				// 아니라면 answer은 false
				answer = false;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		
	}

}
