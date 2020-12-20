package Algorithm023;

public class solution {
	
	// 문자열 뒤집어서 출력하기
	
	public static void main(String[] args) {
		// 받아온 값
		String str = "ADEFH";
		
		// 거꾸로 출력하기
		// str의 길이-1부터 0까지 출력해주면 됩니다.
		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i) + "");
		}
	}

}
