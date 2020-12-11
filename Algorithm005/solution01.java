package Algorithm005;

public class solution01 {
	
	public static void main(String[] args) {
		
		// 대문자는 소문자, 소문자는 대문자로 출력하기 => 내 코드
		
		String word = "helloWorlD";
		
		// String값인 word를 char형대로 변경하여 한글자씩 배열에 담아준다.
		// char배열은 문자당 할당하고 있는 10진수 값이 있기 떄문에 아스키코드로 조건을 주기가 좋다.
		char[] nArr = word.toCharArray();
		
		// 대문자를 소문자로, 소문자를 대문자로 변경한 값을 담아줄 str 변수는 선언한다.
		String str = "";
		// nArr의 크기만큼 반복문을 돌아주면서
		for(int i = 0; i < nArr.length; i++) {
			// 만약에 nArr의 i번지가 65~90 이라면. 즉, A~Z 라면
			// char 값은 할당하고 있는 10진수 값이 있는데 A는 65 Z는 90이다. 그 사이에 있는 값들은 모두 대문자다.
			if(nArr[i] >= 'A' && nArr[i] <= 'Z') {
				// str이라는 변수에 nArr의 i번지를 소문자로 바꾼 후, char 값이기 때문에 String 값으로 형변환 하여 넣어준다.
				str += String.valueOf(nArr[i]).toLowerCase();
			// 그렇지않고 nArr의 i번지 값이 97~122이면. 즉, a~z 라면. 그 사이에 있는 값들은 전부 소문자다.
			} else if(nArr[i] >= 'a' && nArr[i] <= 'z'){
				// sdtr에 nArr의i번지를 대문자로 변경하여 넣어주고.
				str += String.valueOf(nArr[i]).toUpperCase();
			// 혹시모를 공백이 존재할 수 있으므로, nArr의 i번지가 공백이라면,
			} else if(nArr[i] == ' ') {
				// str에 공백을 넣어준다.
				str += " ";
			}
		}
		System.out.println(str);
		
	}

}
